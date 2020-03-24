package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.FundInfoEvent;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.mapper.FundInfoMapper;
import cn.tonghua.database.model.*;
import cn.tonghua.service.dowanloaderror.DownLoadErrorService;
import cn.tonghua.service.utils.CommonGroupUtils;
import cn.tonghua.service.utils.ExcelToListMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPConnectionClosedException;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description基金产品远程端同步数据监听器
 */
@Component
public class FundInfoListener extends AbsLogPrinter {

    @Autowired
    FundInfoMapper fundInfoMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;

    /**
     * 基金
     */
    @EventListener
    @Async
    @Transactional(rollbackFor = Exception.class)
    public void fundInfo(FundInfoEvent fundInfoEvent) {

        FileInputStream in =null;
        try {
            in=new FileInputStream(fundInfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle PRDNAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRDCDE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle NETVALUE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRDATTR = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TANAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle RISKLEVEL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle FUNDRECOMMEND = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ICONPATH = new ExcelToListMap.TableTitle();

        PRDNAME.setToTitle("PRDNAME");
        PRDCDE.setToTitle("PRDCDE");
        NETVALUE.setToTitle("NETVALUE");
        PRDATTR.setToTitle("PRDATTR");
        TANAME.setToTitle("TANAME");
        RISKLEVEL.setToTitle("RISKLEVEL");
        FUNDRECOMMEND.setToTitle("FUNDRECOMMEND");
        PATH.setToTitle("PATH");
        ICONPATH.setToTitle("ICONPATH");

        PRDNAME.setExcelTitle("PRDNAME");
        PRDCDE.setExcelTitle("PRDCDE");
        NETVALUE.setExcelTitle("NETVALUE");
        PRDATTR.setExcelTitle("PRDATTR");
        TANAME.setExcelTitle("TANAME");
        RISKLEVEL.setExcelTitle("RISKLEVEL");
        FUNDRECOMMEND.setExcelTitle("FUNDRECOMMEND");
        PATH.setExcelTitle("PATH");
        ICONPATH.setExcelTitle("ICONPATH");

        map.add(PRDNAME);
        map.add(PRDCDE);
        map.add(NETVALUE);
        map.add(PRDATTR);
        map.add(TANAME);
        map.add(RISKLEVEL);
        map.add(FUNDRECOMMEND);
        map.add(PATH);
        map.add(ICONPATH);

        List<Map<String, String>> maps = new ArrayList<>();
        // 下载地址二维码和产品icon
        List<String> downloadFtpPathList = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        // 获取数据不为空，先清除原来数据在插入新的数据
        if (maps != null && maps.size() >0) {
            // 删除数据
            fundInfoMapper.deleteByExample(new FundInfoExample());
            // 插入数据
            maps.forEach(e->{
                FundInfo fundInfo = new FundInfo();
                fundInfo.setPrdName(e.get("PRDNAME"));
                fundInfo.setPrdCde(e.get("PRDCDE"));
                fundInfo.setNetvalue(e.get("NETVALUE"));
                fundInfo.setPrdattr(e.get("PRDATTR"));
                fundInfo.setTaname(e.get("TANAME"));
                fundInfo.setRiskLevel(e.get("RISKLEVEL"));
                fundInfo.setFundRecommend(e.get("FUNDRECOMMEND"));
                // 下载二维码
                if (StringUtils.isNotBlank(e.get("PATH"))){
                    downloadFtpPathList.add(e.get("PATH"));
                    fundInfo.setPath(e.get("PATH"));
                }
                if (StringUtils.isNotBlank(e.get("ICONPATH"))) {
                    fundInfo.setIconPath(e.get("ICONPATH"));
                }
                fundInfoMapper.insertSelective(fundInfo);
            });
            // 下载图标所有图标都一样所以只下载一次
            if (StringUtils.isNotBlank(maps.get(0).get("ICONPATH"))){
                downloadFtpPathList.add(maps.get(0).get("ICONPATH"));
            }
            // 返回成功时进行下一步
            // 正常返回true执行错误下载，false的话事务回滚
            if (downloadFile(downloadFtpPathList)){
                DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
                DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
                criteria.andProTypeEqualTo("17");
                downLoadErrorService.repeatDownload(downloadErrorMapper.selectByExample(downloadErrorExample));
            } else {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            }
        }
        printInfoMes("end");
    }

    @Value("${ftp.username}")
    private String userName;

    @Value("${ftp.password}")
    private String passWord;

    @Value("${ftp.host}")
    private String ip;

    @Value("${ftp.port}")
    private int port;

    /**
     * 本地ftp地址
     */
    @Value("${ftp.local.path}")
    private String localPath;

    // ftp客户端
    private FTPClient ftpClient = new FTPClient();

    private boolean downloadFile(List<String> urlList){

        // 连接失败
        if(!connectToServer()) {
            return false;
        }
        try {
            // 设置文件传输二进制流
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

//            String localPath = "D:\\ftpserver\\";
            urlList.forEach(e->{
                InputStream in=null;
                try {
                    in=ftpClient.retrieveFileStream(e);
                    if (in !=null) {
                        // 创建文件目录
                        CommonGroupUtils.makeDir(localPath+CommonGroupUtils.pathFiter(e));
                        BufferedOutputStream out=null;
                        in=new BufferedInputStream(in);
                        out=new BufferedOutputStream(new FileOutputStream(localPath+e.replace("/","\\")));
                        int len=-1;
                        byte[] b=new byte[1024];
                        while((len=in.read(b))!=-1){
                            out.write(b,0,len);
                        }
                        in.close();
                        ftpClient.completePendingCommand();
                        out.close();
                        printInfoMes("sucess"+e);
                    }else {
                        DownloadError downloadError = new DownloadError();
                        downloadError.setCreatTime(new Date());
                        downloadError.setProName("fundinfo");
                        downloadError.setProType("17");
                        downloadError.setUrl(e);
//                        downloadErrorMapper.insertSelective(downloadError);
                        downLoadErrorService.errorInsert(downloadError);
                        printErrorMes("error"+e);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
            // 先退出在disconnected根据官方文档logout有可能抛出异常如果写在一起到会导致ftp链接长时间得不到释放
            ftpClient.logout();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            closeConnect();
        }
        return true;
    }

    /**
     * 连接到ftp服务器
     */
    private boolean connectToServer(){
        if (!ftpClient.isConnected()) {
            int reply;
            try {
                //设置连接超时时间
                ftpClient=new FTPClient();
                ftpClient.setConnectTimeout(1000*30);
                //设置ftp字符集
                ftpClient.setControlEncoding("utf-8");
                ftpClient.setDefaultPort(port);
                ftpClient.connect(ip,port);
                ftpClient.login(userName,passWord);
                reply = ftpClient.getReplyCode();

                // 验证连接是否成功
                if (!FTPReply.isPositiveCompletion(reply)) {
                    ftpClient.disconnect();
                    printDebugMes("connectToServer FTP server refused connection.");
                    return false;
                }

            }catch(FTPConnectionClosedException ex){
                printDebugMes("服务器:IP："+ip+"没有连接数！there are too many connected users,please try later", ex);
                ex.printStackTrace();
                return false;
            }catch (Exception e) {
                printDebugMes("登录ftp服务器【"+ip+"】失败", e);
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /**
     *
     * 功能：关闭连接
     */
    private void closeConnect() {
        try {
            if (ftpClient != null) {
                ftpClient.disconnect();
            }
        } catch (Exception e) {
            printDebugMes("ftp连接关闭失败！", e);
        }
    }
}

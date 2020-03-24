package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.ConductInfoEvent;
import cn.tonghua.database.mapper.ConductInfoMapper;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.model.ConductInfo;
import cn.tonghua.database.model.ConductInfoExample;
import cn.tonghua.database.model.DownloadError;
import cn.tonghua.database.model.DownloadErrorExample;
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
 * @Description远程端同步数据监听器
 */
@Component
public class ConductInfoListener extends AbsLogPrinter {

    @Autowired
    ConductInfoMapper conductInfoMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;

    /**
     * 理财展示
     */
    @EventListener
    @Async
    @Transactional(rollbackFor = Exception.class)
    public void conductionInfo(ConductInfoEvent conductInfoEvent) {

        FileInputStream in =null;
        try {
            // 读取本地文件
            in=new FileInputStream(conductInfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle PRDNAME1 = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRDCODE1 = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TEMPLATECODE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PERFIRSTMINAMT = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRDTERM = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle RISKLEVEL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle COLLECTSTART = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle COLLECTEND = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle INCOMESTART = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ICONPATH = new ExcelToListMap.TableTitle();

        PRDNAME1.setToTitle("PRDNAME1");
        PRDCODE1.setToTitle("PRDCODE1");
        TEMPLATECODE.setToTitle("TEMPLATECODE");
        PERFIRSTMINAMT.setToTitle("PERFIRSTMINAMT");
        PRDTERM.setToTitle("PRDTERM");
        RISKLEVEL.setToTitle("RISKLEVEL");
        COLLECTSTART.setToTitle("COLLECTSTART");
        COLLECTEND.setToTitle("COLLECTEND");
        INCOMESTART.setToTitle("INCOMESTART");
        PATH.setToTitle("PATH");
        ICONPATH.setToTitle("ICONPATH");

        PRDNAME1.setExcelTitle("PRDNAME1");
        PRDCODE1.setExcelTitle("PRDCODE1");
        TEMPLATECODE.setExcelTitle("TEMPLATECODE");
        PERFIRSTMINAMT.setExcelTitle("PERFIRSTMINAMT");
        PRDTERM.setExcelTitle("PRDTERM");
        RISKLEVEL.setExcelTitle("RISKLEVEL");
        COLLECTSTART.setExcelTitle("COLLECTSTART");
        COLLECTEND.setExcelTitle("COLLECTEND");
        INCOMESTART.setExcelTitle("INCOMESTART");
        PATH.setExcelTitle("PATH");
        ICONPATH.setExcelTitle("ICONPATH");

        map.add(PRDNAME1);
        map.add(PRDCODE1);
        map.add(TEMPLATECODE);
        map.add(PERFIRSTMINAMT);
        map.add(PRDTERM);
        map.add(RISKLEVEL);
        map.add(COLLECTSTART);
        map.add(COLLECTEND);
        map.add(INCOMESTART);
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
        // 先删除再插入数据
        // 判断是否为空
        if (maps != null && maps.size() > 0) {
            // 删除数据
            conductInfoMapper.deleteByExample(new ConductInfoExample());

            maps.forEach(e->{
                ConductInfo conductInfo = new ConductInfo();
                conductInfo.setPrdName1(e.get("PRDNAME1"));
                conductInfo.setPrdCode1(e.get("PRDCODE1"));
                conductInfo.setTemplateCode(e.get("TEMPLATECODE"));
                conductInfo.setPerfirstminamt(e.get("PERFIRSTMINAMT"));
                conductInfo.setPrdterm(e.get("PRDTERM"));
                conductInfo.setRiskLevel(e.get("RISKLEVEL"));
                conductInfo.setCollectstart(e.get("COLLECTSTART"));
                conductInfo.setCollectend(e.get("COLLECTEND"));
                conductInfo.setIncomestart(e.get("INCOMESTART"));
                // 理财图标和平台图标一样每个产品都不同基金和保险图标都是一样的
                // 下载图标
                if (StringUtils.isNotBlank(e.get("ICONPATH"))){
                    downloadFtpPathList.add(e.get("ICONPATH"));
                    conductInfo.setIconPath(e.get("ICONPATH"));
                }
                // 下载二维码
                if (StringUtils.isNotBlank(e.get("PATH"))){
                    downloadFtpPathList.add(e.get("PATH"));
                    conductInfo.setPath(e.get("PATH"));
                }
                conductInfoMapper.insertSelective(conductInfo);
            });
            // 返回成功时进行下一步
            // 正常返回true执行错误下载，false的话事务回滚
            if (downloadFile(downloadFtpPathList)){
                DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
                DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
                criteria.andProTypeEqualTo("12");
                downLoadErrorService.repeatDownload(downloadErrorMapper.selectByExample(downloadErrorExample));
            } else {
                // 回滚数据
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

    @Value("${ftp.local.path}")
    private String localPath;

    // ftp客户端
    private FTPClient ftpClient = new FTPClient();

    private boolean downloadFile(List<String> urlList){

        // 如果ftp连接不成功或者出错,返回false数据回滚
        if(!connectToServer()) {
            return false;
        }
        try {
            // 文件传输按照二进制吴顺
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            // todo 在配置文件里面已经配置了。测试确认有无问题
//            String localPath = "D:\\ftpserver\\";
            urlList.forEach(e->{
                InputStream in=null;
                try {
                    in=ftpClient.retrieveFileStream(e);
                    if (in !=null) {
                        // 创建文件目录（首先判断本地是否有此文件夹）
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
                        downloadError.setProName("conductioninfo");
                        downloadError.setProType("12");
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
            // 断开连接
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
                // 连接返回值
                reply = ftpClient.getReplyCode();
                // 连接没有成功
                if (!FTPReply.isPositiveCompletion(reply)) {
                    ftpClient.disconnect();
                    printErrorMes("connectToServer FTP server refused connection.");
                    return false;
                }
            }catch(FTPConnectionClosedException ex){
                printErrorMes("服务器:IP："+ip+"没有连接数！there are too many connected users,please try later", ex);
                ex.printStackTrace();
                return false;
            }catch (Exception e) {
                printErrorMes("登录ftp服务器【"+ip+"】失败", e);
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
            if (ftpClient != null&& ftpClient.isConnected()) {
                ftpClient.disconnect();
            }
        } catch (Exception e) {
            printDebugMes("ftp连接关闭失败！", e);
        }
    }
}

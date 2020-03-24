package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.JrproductInfoEvent;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.mapper.JrproductInfoMapper;
import cn.tonghua.database.model.DownloadError;
import cn.tonghua.database.model.DownloadErrorExample;
import cn.tonghua.database.model.JrproductInfo;
import cn.tonghua.database.model.JrproductInfoExample;
import cn.tonghua.service.dowanloaderror.DownLoadErrorService;
import cn.tonghua.service.htmlcovertext.Html2TextService;
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
import java.util.*;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description远程端同步数据监听器
 */
@Component
public class JrproductInfoListener extends AbsLogPrinter {

    @Autowired
    JrproductInfoMapper jrproductInfoMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;

    @Autowired
    Html2TextService html2TextService;

    /**
     * 服务平台数据展示
     */
    @EventListener
    @Async
    @Transactional(rollbackFor = Exception.class)
    public void jrproductInfo(JrproductInfoEvent jrproductInfoEvent) {

        FileInputStream in =null;
        try {
            in=new FileInputStream(jrproductInfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle PRODUCTID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRODUCTNAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle CLASSIFICATION = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRODUCTNUM = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRODUCTURL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRODUCTION = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle POSTER = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle QRPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRODUCTDETAILS = new ExcelToListMap.TableTitle();

        PRODUCTID.setToTitle("PRODUCTID");
        PRODUCTNAME.setToTitle("PRODUCTNAME");
        CLASSIFICATION.setToTitle("CLASSIFICATION");
        PRODUCTNUM.setToTitle("PRODUCTNUM");
        PRODUCTURL.setToTitle("PRODUCTURL");
        PRODUCTION.setToTitle("PRODUCTION");
        POSTER.setToTitle("POSTER");
        QRPATH.setToTitle("QRPATH");
        PRODUCTDETAILS.setToTitle("PRODUCTDETAILS");

        PRODUCTID.setExcelTitle("PRODUCTID");
        PRODUCTNAME.setExcelTitle("PRODUCTNAME");
        CLASSIFICATION.setExcelTitle("CLASSIFICATION");
        PRODUCTNUM.setExcelTitle("PRODUCTNUM");
        PRODUCTURL.setExcelTitle("PRODUCTURL");
        PRODUCTION.setExcelTitle("PRODUCTION");
        POSTER.setExcelTitle("POSTER");
        QRPATH.setExcelTitle("QRPATH");
        PRODUCTDETAILS.setExcelTitle("PRODUCTDETAILS");

        map.add(PRODUCTID);
        map.add(PRODUCTNAME);
        map.add(CLASSIFICATION);
        map.add(PRODUCTNUM);
        map.add(PRODUCTURL);
        map.add(PRODUCTION);
        map.add(POSTER);
        map.add(QRPATH);
        map.add(PRODUCTDETAILS);

        List<Map<String, String>> maps = new ArrayList<>();
        List<JrproductInfo> jrproductInfos = new ArrayList<>();
        List<String> downlaodPathList = new ArrayList<>();
        List<String> posterList = new ArrayList<>();
//        List<String> producticonList = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        if (maps != null && maps.size() >0) {
            // 先删除数据
            jrproductInfoMapper.deleteByExample(new JrproductInfoExample());
            // 数据插入
            maps.forEach(e->{
                JrproductInfo jrproductInfo = new JrproductInfo();
                jrproductInfo.setProductid(e.get("PRODUCTID"));
                jrproductInfo.setProductname(e.get("PRODUCTNAME"));
                jrproductInfo.setClassification(e.get("CLASSIFICATION"));
                jrproductInfo.setProductnum(e.get("PRODUCTNUM"));
                jrproductInfo.setProducturl(e.get("PRODUCTURL"));
                try {
                    jrproductInfo.setProductdetails(html2TextService.parse(e.get("PRODUCTDETAILS")));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                jrproductInfos.add(jrproductInfo);
                // 判断二维码不可为空
                if (StringUtils.isNotBlank(e.get("QRPATH"))) {
                    downlaodPathList.add(e.get("QRPATH"));
                    jrproductInfo.setQrpath(e.get("QRPATH"));
                }
                // 判断商品图片不可为空添加头部信息
                if (StringUtils.isNotBlank(e.get("POSTER"))) {
                    downlaodPathList.addAll(Arrays.asList(e.get("POSTER").split(",")));
                    jrproductInfo.setPoster(e.get("POSTER").replace(",",",http//:"));
                }
                // 判断产品icon不可为空
                if (StringUtils.isNotBlank(jrproductInfo.getProduction())) {
                    downlaodPathList.add(jrproductInfo.getProduction());
                    jrproductInfo.setProduction(e.get("PRODUCTION"));
                }
                jrproductInfoMapper.insertSelective(jrproductInfo);
            });
//        qrpathList.addAll(producticonList);
            // 循环下载二维码图片
//        downloadFile(qrpathList);
            // 循环下载产品图片图片
//        downloadFile(producticonList);
            // 循环下载产品icon
//        posterList.forEach(e->{
//            List<String> temp= Arrays.asList(e.split(","));
//            downlaodPathList.addAll(temp);
////            downloadFile(temp);
//        });
            if (downloadFile(downlaodPathList)){
                DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
                DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
                criteria.andProTypeEqualTo("15");
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

        // 连接失败数据回滚
        if(!connectToServer()) {
            return false;
        }
        try {
            // 文件传输按照二进制流
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
                        downloadError.setProName("jrproductinfo");
                        downloadError.setProType("15");
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

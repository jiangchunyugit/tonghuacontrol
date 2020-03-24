package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.ProducticonInfoEvent;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.mapper.ProducticonInfoMapper;
import cn.tonghua.database.model.DownloadError;
import cn.tonghua.database.model.DownloadErrorExample;
import cn.tonghua.database.model.ProducticonInfo;
import cn.tonghua.service.dowanloaderror.DownLoadErrorService;
import cn.tonghua.service.utils.CommonGroupUtils;
import cn.tonghua.service.utils.ExcelToListMap;
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
public class ProducticonInfoListener extends AbsLogPrinter {

    @Autowired
    ProducticonInfoMapper producticonInfoMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;

    /**
     * 废弃不用
     */
    @EventListener
    @Async
    public void staffinfo(ProducticonInfoEvent producticonInfoEvent) throws InterruptedException {

        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(producticonInfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle ICONID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ICONPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle CLASSIFICATION = new ExcelToListMap.TableTitle();

        ICONID.setToTitle("ICONID");
        ICONPATH.setToTitle("ICONPATH");
        CLASSIFICATION.setToTitle("CLASSIFICATION");

        ICONID.setExcelTitle("ICONID");
        ICONPATH.setExcelTitle("ICONPATH");
        CLASSIFICATION.setExcelTitle("CLASSIFICATION");

        map.add(ICONID);
        map.add(ICONPATH);
        map.add(CLASSIFICATION);

        List<Map<String, String>> maps = new ArrayList<>();
        List<ProducticonInfo> producticonInfos = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        maps.forEach(e->{
            ProducticonInfo producticonInfo = new ProducticonInfo();
            producticonInfo.setIconid(e.get("ICONID"));
            producticonInfo.setClassification(e.get("CLASSIFICATION"));
            producticonInfo.setIconpath(e.get("ICONPATH"));
            producticonInfos.add(producticonInfo);
            producticonInfoMapper.insertSelective(producticonInfo);
        });
        if (downloadFile(producticonInfos)) {
            DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
            DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
            criteria.andProTypeEqualTo("16");
            downLoadErrorService.repeatDownload(downloadErrorMapper.selectByExample(downloadErrorExample));
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

    @Value("${ftp.filepath}")

    // 文件存放的目录
    private String CURRENT_DIR;

    // ftp客户端
    private FTPClient ftpClient = new FTPClient();

    private boolean downloadFile(List<ProducticonInfo> producticonInfos){

        try {
            connectToServer();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            int reply = ftpClient.getReplyCode();
            if(!FTPReply.isPositiveCompletion(reply))
            {
                ftpClient.logout();
                ftpClient.disconnect();
                printErrorMes("failed to connect to the FTP Server:"+ip);
                return false;
            }

            String localPath = "D:\\ftpserver\\";
            producticonInfos.forEach(e->{
                InputStream in=null;
                try {
                    in=ftpClient.retrieveFileStream(e.getIconpath());
                    if (in !=null) {
                        // 创建文件目录
                        CommonGroupUtils.makeDir(localPath+CommonGroupUtils.pathFiter(e.getIconpath()));
                        BufferedOutputStream out=null;
                        in=new BufferedInputStream(in);
                        out=new BufferedOutputStream(new FileOutputStream(localPath+e.getIconpath().replace("/","\\")));
                        int len=-1;
                        byte[] b=new byte[1024];
                        while((len=in.read(b))!=-1){
                            out.write(b,0,len);
                        }
                        in.close();
                        ftpClient.completePendingCommand();
                        out.close();
                        printInfoMes("sucess"+e.getIconpath());
                    }else {
                        DownloadError downloadError = new DownloadError();
                        downloadError.setCreatTime(new Date());
                        downloadError.setProName("producticoninfo");
                        downloadError.setProType("16");
                        downloadError.setUrl(e.getIconpath());
//                        downloadErrorMapper.insertSelective(downloadError);
                        downLoadErrorService.errorInsert(downloadError);
                        printErrorMes("error"+e.getIconpath());
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
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
    private void connectToServer() throws FTPConnectionClosedException,Exception {
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
                }

            }catch(FTPConnectionClosedException ex){
                printDebugMes("服务器:IP："+ip+"没有连接数！there are too many connected users,please try later", ex);
                ex.printStackTrace();
            }catch (Exception e) {
                printDebugMes("登录ftp服务器【"+ip+"】失败", e);
                e.printStackTrace();
            }
        }
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

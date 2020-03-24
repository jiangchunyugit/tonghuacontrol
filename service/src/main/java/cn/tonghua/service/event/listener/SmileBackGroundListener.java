package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.SmileBackGroundEvent;
import cn.tonghua.database.model.StaffInfo;
import cn.tonghua.service.utils.CommonGroupUtils;
import cn.tonghua.service.utils.ExcelToListMap;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPConnectionClosedException;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description远程端同步数据监听器
 */
@Component
public class SmileBackGroundListener extends AbsLogPrinter {

    /**
     * 微笑打分背景图
     */
    @EventListener
    @Async
    public void smileBackGround(SmileBackGroundEvent smileBackGroundEvent){

        FileInputStream in =null;
        try {
            // 行员照片
            in=new FileInputStream(smileBackGroundEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle MATERIALPATH = new ExcelToListMap.TableTitle();

        MATERIALPATH.setToTitle("MATERIALPATH");

        MATERIALPATH.setExcelTitle("MATERIALPATH");

        map.add(MATERIALPATH);

        List<Map<String, String>> maps = new ArrayList<>();
        List<StaffInfo> staffInfos = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        //
        String smilePath = "D:\\ftpserver\\smilebackground\\background.png";

        SmilePath smilePatha = new SmilePath();

        for (Map<String, String> e : maps) {
            smilePatha.setFtpPath(e.get("MATERIALPATH"));
            smilePatha.setLocalPath(smilePath);
        }
        // 图片下载
        downloadFile(smilePatha);
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

    private boolean downloadFile(SmilePath smilePath){

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
            InputStream in=null;
            try {
                in=ftpClient.retrieveFileStream(smilePath.getFtpPath());
                if (in !=null) {
                    // 创建文件目录
//                        CommonGroupUtils.makeDir(localPath+CommonGroupUtils.pathFiter(e.getTmpPath()));
                    // todo 删除smile文件夹下面内容
                        CommonGroupUtils.deleteDir("D:\\ftpserver\\smilebackground");
                    BufferedOutputStream out=null;
                    in=new BufferedInputStream(in);
                    out=new BufferedOutputStream(new FileOutputStream(smilePath.getLocalPath()));
                    int len=-1;
                    byte[] b=new byte[1024];
                    while((len=in.read(b))!=-1){
                        out.write(b,0,len);
                    }
                    in.close();
                    ftpClient.completePendingCommand();
                    out.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
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

    /**使用FileOutputStream来写入txt文件
     * @param txtPath txt文件路径
     * @param content 需要写入的文本
     */
    private  void writeTxt(String txtPath,String content){
        FileOutputStream fileOutputStream = null;
        File file = new File(txtPath);
        try {
            if(file.exists()){
                //判断文件是否存在，如果不存在就新建一个txt
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class SmilePath{

        private String ftpPath;

        private String localPath;

        public String getFtpPath() {
            return ftpPath;
        }

        public void setFtpPath(String ftpPath) {
            this.ftpPath = ftpPath;
        }

        public String getLocalPath() {
            return localPath;
        }

        public void setLocalPath(String localPath) {
            this.localPath = localPath;
        }
    }
}

//package cn.tonghua.service.config;
//
//import cn.tonghua.core.logger.AbsLogPrinter;
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPReply;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.net.SocketException;
//
//@Configuration
//public class FtpConfig extends AbsLogPrinter {
//
//    @Value("${ftp.port}")
//    private String port;
//
//    @Value("${ftp.host}")
//    private String adress;
//
//    @Bean
//    public FTPClient ftpClient(){
//////        BeansEntity beansEntity =new BeansEntity();
//////        FtpEntity ftpEntity = new FtpEntity();
////        FTPClient ftpClient = new FTPClient();
////        ftpClient.setConnectTimeout(1000*30);//设置连接超时时间
////        ftpClient.setControlEncoding("utf-8");//设置ftp字符集
//////        ftpClient.enterLocalPassiveMode();//设置被动模式，文件传输端口设置
////        try {
//////            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);//设置文件传输模式为二进制，可以保证传输的内容不会被改变
//////            ftpClient.connect(beansEntity.getIp()+":"+beansEntity.getPort());
////            ftpClient.setDefaultPort(Integer.parseInt(port));
////            ftpClient.connect(adress, Integer.parseInt(port));
////            // 匿名
//////            ftpClient.login(ftpEntity.getFtpUsername(),ftpEntity.getFtpPassword());
////            int replyCode = ftpClient.getReplyCode();
////            if (!FTPReply.isPositiveCompletion(replyCode)){
////                ftpClient.disconnect();
////                printInfoMes("未连接到FTP，用户名或密码错误!");
////                return null;
////            }else {
////                printInfoMes("FTP连接成功!");
////                return ftpClient;
////            }
////        } catch (SocketException socketException) {
////            printInfoMes("FTP的IP地址可能错误，请正确配置!");
////            return null;
////        } catch (IOException ioException) {
////            ioException.printStackTrace();
////            printInfoMes("FTP的端口错误,请正确配置!");
////            return null;
////        }
////    }
////}

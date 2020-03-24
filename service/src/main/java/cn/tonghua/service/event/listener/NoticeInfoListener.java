package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.NoticeInfoEvent;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.mapper.NoticeInfoMapper;
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
import java.util.*;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description远程端同步数据监听器
 */
@Component
public class NoticeInfoListener extends AbsLogPrinter {

    @Autowired
    NoticeInfoMapper noticeInfoMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;
    /**
     * 大事记
     */
    @EventListener
    @Async
    @Transactional(rollbackFor = Exception.class)
    public void notice(NoticeInfoEvent noticeInfoEvent) {

        FileInputStream in =null;
        try {
            in=new FileInputStream(noticeInfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle NOTICEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle NOTICENAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle QSNOTICETIME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ZZNOTICETIME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle VIDEOPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PHOTOPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TYPE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ORGCODE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle LEVELFLG = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle INTPHOTOPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle INTPDFURL = new ExcelToListMap.TableTitle();

        NOTICEID.setToTitle("NOTICEID");
        NOTICENAME.setToTitle("NOTICENAME");
        QSNOTICETIME.setToTitle("QSNOTICETIME");
        ZZNOTICETIME.setToTitle("ZZNOTICETIME");
        VIDEOPATH.setToTitle("VIDEOPATH");
        PHOTOPATH.setToTitle("PHOTOPATH");
        TYPE.setToTitle("TYPE");
        ORGCODE.setToTitle("ORGCODE");
        LEVELFLG.setToTitle("LEVELFLG");
        INTPHOTOPATH.setToTitle("INTPHOTOPATH");
        INTPDFURL.setToTitle("INTPDFURL");

        NOTICEID.setExcelTitle("NOTICEID");
        NOTICENAME.setExcelTitle("NOTICENAME");
        QSNOTICETIME.setExcelTitle("QSNOTICETIME");
        ZZNOTICETIME.setExcelTitle("ZZNOTICETIME");
        VIDEOPATH.setExcelTitle("VIDEOPATH");
        PHOTOPATH.setExcelTitle("PHOTOPATH");
        TYPE.setExcelTitle("TYPE");
        ORGCODE.setExcelTitle("ORGCODE");
        LEVELFLG.setExcelTitle("LEVELFLG");
        INTPHOTOPATH.setExcelTitle("INTPHOTOPATH");
        INTPDFURL.setExcelTitle("INTPDFURL");

        map.add(NOTICEID);
        map.add(NOTICENAME);
        map.add(QSNOTICETIME);
        map.add(ZZNOTICETIME);
        map.add(VIDEOPATH);
        map.add(PHOTOPATH);
        map.add(TYPE);
        map.add(ORGCODE);
        map.add(LEVELFLG);
        map.add(INTPHOTOPATH);
        map.add(INTPDFURL);

        List<Map<String, String>> maps = new ArrayList<>();
        List<NoticeInfo> noticeInfos = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        // 删除之后在插入数据
        if (maps != null && maps.size()>0) {
            noticeInfoMapper.deleteByExample(new NoticeInfoExample());
            // 存放所有的地址
            List<String> urlListall = new ArrayList<>();
            // 空值maps size为空。
            maps.forEach(e->{
                NoticeInfoWithBLOBs noticeInfo = new NoticeInfoWithBLOBs();
                noticeInfo.setNoticeid(e.get("NOTICEID"));
                noticeInfo.setNoticename(e.get("NOTICENAME"));
                noticeInfo.setQsnoticetime(e.get("QSNOTICETIME"));
                noticeInfo.setZznoticetime(e.get("ZZNOTICETIME"));
                noticeInfo.setVideopath(e.get("VIDEOPATH"));
                noticeInfo.setPhotopath(e.get("PHOTOPATH"));
                noticeInfo.setIntPhotopath(e.get("INTPHOTOPATH"));
                noticeInfo.setType(e.get("TYPE"));
                noticeInfo.setOrgcode(e.get("ORGCODE"));
                noticeInfo.setLevelflg(e.get("LEVELFLG"));

                noticeInfos.add(noticeInfo);
                noticeInfoMapper.insertSelective(noticeInfo);
                // 创建list存放图片地址。
                if (StringUtils.isNotBlank(noticeInfo.getPhotopath())){
                    List<String> urlList = Arrays.asList(noticeInfo.getPhotopath().split(","));
                    urlListall.addAll(urlList);
                }
                // 创建list存放图片地址。
                if (StringUtils.isNotBlank(noticeInfo.getIntPhotopath())){
                    List<String> urlList1 = Arrays.asList(noticeInfo.getIntPhotopath().split(","));
                    urlListall.addAll(urlList1);
                }
                // 存放视频地址
                if (StringUtils.isNotBlank(noticeInfo.getVideopath())) {
                    urlListall.add(noticeInfo.getVideopath());
                }
            });

            if (downloadFile(urlListall)) {
                // 重新下载下载失败的地址
                DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
                DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
                criteria.andProTypeEqualTo("4");
                downLoadErrorService.repeatDownload(downloadErrorMapper.selectByExample(downloadErrorExample));
            }else {
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

        // 连接失败返回false数据回滚
        if(!connectToServer()) {
            return false;
        }
        try {
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
                        downloadError.setProName("notice");
                        downloadError.setProType("4");
                        downloadError.setUrl(e);
//                        downloadErrorMapper.insertSelective(downloadError);
                        downLoadErrorService.errorInsert(downloadError);
                        printErrorMes("error"+e);
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
    private boolean connectToServer() {
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
    public void closeConnect() {
        try {
            if (ftpClient != null) {
                ftpClient.disconnect();
            }
        } catch (Exception e) {
            printDebugMes("ftp连接关闭失败！", e);
        }
    }
}

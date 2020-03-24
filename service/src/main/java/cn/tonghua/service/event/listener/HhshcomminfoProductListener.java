package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.HhshcomminfoEvent;
import cn.tonghua.database.event.HhshcomminfoProductEvent;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.mapper.HhshcomminfoMapper;
import cn.tonghua.database.mapper.HhshcomminfoProdutMapper;
import cn.tonghua.database.model.DownloadError;
import cn.tonghua.database.model.DownloadErrorExample;
import cn.tonghua.database.model.Hhshcomminfo;
import cn.tonghua.database.model.HhshcomminfoProdut;
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
 * @Description题库远程端同步数据监听器
 */
@Component
public class HhshcomminfoProductListener extends AbsLogPrinter {

    @Autowired
    HhshcomminfoProdutMapper hhshcomminfoProdutMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;

    /**
     * 贵金属产品表（智慧瀑布（展示海慧生活））废弃不用
     */
    @EventListener
    @Async
    public void hhshcomminfoProduct(HhshcomminfoProductEvent hhshcomminfoProductEvent){
        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(hhshcomminfoProductEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle NAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRICE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle CURR_PRICE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle QDB_PRICE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle EFFECT_END_DATE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle SHOPNAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle BISINESSTIME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TELEPHONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DETAIL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ADDRESS = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle IMG_URL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle EW_IMG_URL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle REVEAL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle COMMURL = new ExcelToListMap.TableTitle();

        NAME.setToTitle("NAME");
        PRICE.setToTitle("PRICE");
        CURR_PRICE.setToTitle("CURR_PRICE");
        QDB_PRICE.setToTitle("QDB_PRICE");
        EFFECT_END_DATE.setToTitle("EFFECT_END_DATE");
        SHOPNAME.setToTitle("SHOPNAME");
        BISINESSTIME.setToTitle("BISINESSTIME");
        TELEPHONE.setToTitle("TELEPHONE");
        DETAIL.setToTitle("DETAIL");
        ADDRESS.setToTitle("ADDRESS");
        IMG_URL.setToTitle("IMG_URL");
        EW_IMG_URL.setToTitle("EW_IMG_URL");
        REVEAL.setToTitle("REVEAL");
        COMMURL.setToTitle("COMMURL");

        NAME.setExcelTitle("NAME");
        PRICE.setExcelTitle("PRICE");
        CURR_PRICE.setExcelTitle("CURR_PRICE");
        QDB_PRICE.setExcelTitle("QDB_PRICE");
        EFFECT_END_DATE.setExcelTitle("EFFECT_END_DATE");
        SHOPNAME.setExcelTitle("SHOPNAME");
        BISINESSTIME.setExcelTitle("BISINESSTIME");
        TELEPHONE.setExcelTitle("TELEPHONE");
        DETAIL.setExcelTitle("DETAIL");
        ADDRESS.setExcelTitle("ADDRESS");
        IMG_URL.setExcelTitle("IMG_URL");
        EW_IMG_URL.setExcelTitle("EW_IMG_URL");
        REVEAL.setExcelTitle("REVEAL");
        COMMURL.setExcelTitle("COMMURL");

        map.add(NAME);
        map.add(PRICE);
        map.add(CURR_PRICE);
        map.add(QDB_PRICE);
        map.add(EFFECT_END_DATE);
        map.add(SHOPNAME);
        map.add(BISINESSTIME);
        map.add(TELEPHONE);
        map.add(DETAIL);
        map.add(ADDRESS);
        map.add(IMG_URL);
        map.add(EW_IMG_URL);
        map.add(REVEAL);
        map.add(COMMURL);

        List<Map<String, String>> maps = new ArrayList<>();
        List<HhshcomminfoProdut> hhshcomminfos = new ArrayList<>();
        List<String> imgUrlList = new ArrayList<>();
        List<String> commurlList = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        maps.forEach(e->{
            HhshcomminfoProdut hhshcomminfo = new HhshcomminfoProdut();
            hhshcomminfo.setName(e.get("NAME"));
            hhshcomminfo.setPrice(e.get("PRICE"));
            hhshcomminfo.setCurrPrice(e.get("CURR_PRICE"));
            hhshcomminfo.setQdbPrice(e.get("QDB_PRICE"));
            hhshcomminfo.setEffectEndDate(e.get("EFFECT_END_DATE"));
            hhshcomminfo.setShopname(e.get("SHOPNAME"));
            hhshcomminfo.setBisinesstime(e.get("BISINESSTIME"));
            hhshcomminfo.setTelephone(e.get("TELEPHONE"));
            hhshcomminfo.setDetail(e.get("DETAIL"));
            hhshcomminfo.setAddress(e.get("ADDRESS"));
            hhshcomminfo.setImgUrl(e.get("IMG_URL"));
            hhshcomminfo.setEwImgUrl(e.get("EW_IMG_URL"));
            hhshcomminfo.setCommurl(e.get("COMMURL"));
            hhshcomminfo.setReveal(e.get("REVEAL"));
            hhshcomminfos.add(hhshcomminfo);
            imgUrlList.add(hhshcomminfo.getImgUrl());
            commurlList.add(hhshcomminfo.getCommurl());
            hhshcomminfoProdutMapper.insertSelective(hhshcomminfo);
        });
        imgUrlList.addAll(commurlList);
//        downloadFile(commurlList);
        if (downloadFile(imgUrlList)){
            DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
            DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
            criteria.andProTypeEqualTo("61");
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

    private boolean downloadFile(List<String> urlList){

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
                        downloadError.setProName("hhshcomminfoproducts");
                        downloadError.setProType("61");
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

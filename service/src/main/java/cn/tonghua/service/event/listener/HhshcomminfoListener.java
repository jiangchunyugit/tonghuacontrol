package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.AssessmentEvent;
import cn.tonghua.database.event.HhshcomminfoEvent;
import cn.tonghua.database.event.HhshcomminfoProductEvent;
import cn.tonghua.database.event.TouristEvent;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.mapper.HhshcomminfoMapper;
import cn.tonghua.database.mapper.HhshcomminfoProdutMapper;
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

import java.io.*;
import java.util.*;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description题库远程端同步数据监听器
 */
@Component
public class HhshcomminfoListener extends AbsLogPrinter {

    @Autowired
    HhshcomminfoMapper hhshcomminfoMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;

    /**
     * 贵金属展示柜
     */
    @EventListener
    @Async
    public void hhshcomminfo(HhshcomminfoEvent hhshcomminfoEvent){
        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(hhshcomminfoEvent.getSource());
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
        ExcelToListMap.TableTitle BUSINESSTIME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TELEPHONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DETAIL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ADDRESS = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle IMG_URL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle EW_IMG_URL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle REVEAL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle COMMURL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle LAT = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle LON = new ExcelToListMap.TableTitle();


        NAME.setToTitle("NAME");
        PRICE.setToTitle("PRICE");
        CURR_PRICE.setToTitle("CURR_PRICE");
        QDB_PRICE.setToTitle("QDB_PRICE");
        EFFECT_END_DATE.setToTitle("EFFECT_END_DATE");
        SHOPNAME.setToTitle("SHOPNAME");
        BUSINESSTIME.setToTitle("BUSINESSTIME");
        TELEPHONE.setToTitle("TELEPHONE");
        DETAIL.setToTitle("DETAIL");
        ADDRESS.setToTitle("ADDRESS");
        IMG_URL.setToTitle("IMG_URL");
        EW_IMG_URL.setToTitle("EW_IMG_URL");
        REVEAL.setToTitle("REVEAL");
        COMMURL.setToTitle("COMMURL");
        LAT.setToTitle("LAT");
        LON.setToTitle("LON");

        NAME.setExcelTitle("NAME");
        PRICE.setExcelTitle("PRICE");
        CURR_PRICE.setExcelTitle("CURR_PRICE");
        QDB_PRICE.setExcelTitle("QDB_PRICE");
        EFFECT_END_DATE.setExcelTitle("EFFECT_END_DATE");
        SHOPNAME.setExcelTitle("SHOPNAME");
        BUSINESSTIME.setExcelTitle("BUSINESSTIME");
        TELEPHONE.setExcelTitle("TELEPHONE");
        DETAIL.setExcelTitle("DETAIL");
        ADDRESS.setExcelTitle("ADDRESS");
        IMG_URL.setExcelTitle("IMG_URL");
        EW_IMG_URL.setExcelTitle("EW_IMG_URL");
        REVEAL.setExcelTitle("REVEAL");
        COMMURL.setExcelTitle("COMMURL");
        LAT.setExcelTitle("LAT");
        LON.setExcelTitle("LON");

        map.add(NAME);
        map.add(PRICE);
        map.add(CURR_PRICE);
        map.add(QDB_PRICE);
        map.add(EFFECT_END_DATE);
        map.add(SHOPNAME);
        map.add(BUSINESSTIME);
        map.add(TELEPHONE);
        map.add(DETAIL);
        map.add(ADDRESS);
        map.add(IMG_URL);
        map.add(EW_IMG_URL);
        map.add(REVEAL);
        map.add(COMMURL);
        map.add(LAT);
        map.add(LON);

        List<Map<String, String>> maps = new ArrayList<>();
        List<Hhshcomminfo> hhshcomminfos = new ArrayList<>();
        List<String> imgUrlList = new ArrayList<>();
        List<String> commurlList = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        if (maps.size()>0) {
            hhshcomminfoMapper.deleteByExample(new HhshcomminfoExample());
        }
        maps.forEach(e->{
            Hhshcomminfo hhshcomminfo = new Hhshcomminfo();
            hhshcomminfo.setName(e.get("NAME"));
            hhshcomminfo.setPrice(e.get("PRICE"));
            hhshcomminfo.setCurrPrice(e.get("CURR_PRICE"));
            hhshcomminfo.setQdbPrice(e.get("QDB_PRICE"));
            hhshcomminfo.setEffectEndDate(e.get("EFFECT_END_DATE"));
            hhshcomminfo.setShopname(e.get("SHOPNAME"));
            hhshcomminfo.setBisinesstime(e.get("BUSINESSTIME"));
            hhshcomminfo.setTelephone(e.get("TELEPHONE"));
            hhshcomminfo.setDetail(e.get("DETAIL"));
            hhshcomminfo.setAddress(e.get("ADDRESS"));
            hhshcomminfo.setImgUrl(e.get("IMG_URL"));
            hhshcomminfo.setEwImgUrl(e.get("EW_IMG_URL"));
            hhshcomminfo.setCommurl(e.get("COMMURL"));
            hhshcomminfo.setReveal(e.get("REVEAL"));
            hhshcomminfos.add(hhshcomminfo);
            // 图片不为空
            if (StringUtils.isNotBlank(hhshcomminfo.getImgUrl())) {
                imgUrlList.add(Arrays.asList(hhshcomminfo.getImgUrl().split(",")).get(0));
            }
            // 二维码不为空
            if (StringUtils.isNotBlank(hhshcomminfo.getCommurl())) {
                commurlList.add(hhshcomminfo.getCommurl());
            }
            hhshcomminfoMapper.insertSelective(hhshcomminfo);
        });
        // 把所有list叠加
        imgUrlList.addAll(commurlList);
        if (downloadFile(imgUrlList)){
            DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
            DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
            criteria.andProTypeEqualTo("6");
            downLoadErrorService.repeatDownload(downloadErrorMapper.selectByExample(downloadErrorExample));
        }
        // 把所有list叠加
//        downloadFile(commurlList);
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

        if(!connectToServer())
        {
            printErrorMes("failed to connect to the FTP Server:"+ip);
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
                        downloadError.setProName("hhshcomminfos");
                        downloadError.setProType("6");
                        downloadError.setUrl(e);
//                        downloadErrorMapper.insertSelective(downloadError);
                        downLoadErrorService.errorInsert(downloadError);
                        printErrorMes("error"+e);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
            // 先退出在disconnected
            ftpClient.logout();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 先退出在disconnected
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
    private void closeConnect() {
        try {
            if (ftpClient != null) {
                ftpClient.disconnect();
            }
        } catch (Exception e) {
            printErrorMes("ftp连接关闭失败！", e);
        }
    }

}

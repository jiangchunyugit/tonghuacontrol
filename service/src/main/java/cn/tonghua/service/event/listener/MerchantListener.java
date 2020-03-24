package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.MerchantEvent;
import cn.tonghua.database.mapper.DownloadErrorMapper;
import cn.tonghua.database.mapper.MerchantMapper;
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
 * @Description题库远程端同步数据监听器
 */
@Component
public class MerchantListener extends AbsLogPrinter {

    @Autowired
    MerchantMapper merchantMapper;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    @Autowired
    DownloadErrorMapper downloadErrorMapper;

    /**
     * 商户商圈，企业信息（山东文化，滑轨屏）
     */
    @EventListener
    @Async
    @Transactional(rollbackFor = Exception.class)
    public void merchant(MerchantEvent merchantEvent) {

        FileInputStream in =null;
        try {
            in=new FileInputStream(merchantEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle MERCHANTID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle MERCHANTNAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle MERCHANTPHONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle CHARGEPERSON = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PERSONPHONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle POSTER = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ADDRESS = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle MERCHANTURL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle QRCODEPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ORGCODE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle AUDITTIME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle MERCHANTSTATUS = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle LOGOPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle INTRODUCE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle LOGONAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle POSTERNAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle VIDEOPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle FWQRPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle EQUITYPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle LONGITUDE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle LATITUDE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle USEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle USENAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle REVEAL = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TYPE = new ExcelToListMap.TableTitle();


        MERCHANTID.setToTitle("MERCHANTID");
        MERCHANTNAME.setToTitle("MERCHANTNAME");
        MERCHANTPHONE.setToTitle("MERCHANTPHONE");
        CHARGEPERSON.setToTitle("CHARGEPERSON");
        PERSONPHONE.setToTitle("PERSONPHONE");
        POSTER.setToTitle("POSTER");
        ADDRESS.setToTitle("ADDRESS");
        MERCHANTURL.setToTitle("MERCHANTURL");
        QRCODEPATH.setToTitle("QRCODEPATH");
        ORGCODE.setToTitle("ORGCODE");
        AUDITTIME.setToTitle("AUDITTIME");
        MERCHANTSTATUS.setToTitle("MERCHANTSTATUS");
        LOGOPATH.setToTitle("LOGOPATH");
        INTRODUCE.setToTitle("INTRODUCE");
        LOGONAME.setToTitle("LOGONAME");
        POSTERNAME.setToTitle("POSTERNAME");
        VIDEOPATH.setToTitle("VIDEOPATH");
        FWQRPATH.setToTitle("FWQRPATH");
        EQUITYPATH.setToTitle("EQUITYPATH");
        LONGITUDE.setToTitle("LONGITUDE");
        LATITUDE.setToTitle("LATITUDE");
        USEID.setToTitle("USEID");
        USENAME.setToTitle("USENAME");
        REVEAL.setToTitle("REVEAL");
        TYPE.setToTitle("TYPE");

        MERCHANTID.setExcelTitle("MERCHANTID");
        MERCHANTNAME.setExcelTitle("MERCHANTNAME");
        MERCHANTPHONE.setExcelTitle("MERCHANTPHONE");
        CHARGEPERSON.setExcelTitle("CHARGEPERSON");
        PERSONPHONE.setExcelTitle("PERSONPHONE");
        POSTER.setExcelTitle("POSTER");
        ADDRESS.setExcelTitle("ADDRESS");
        MERCHANTURL.setExcelTitle("MERCHANTURL");
        QRCODEPATH.setExcelTitle("QRCODEPATH");
        ORGCODE.setExcelTitle("ORGCODE");
        AUDITTIME.setExcelTitle("AUDITTIME");
        MERCHANTSTATUS.setExcelTitle("MERCHANTSTATUS");
        LOGOPATH.setExcelTitle("LOGOPATH");
        INTRODUCE.setExcelTitle("INTRODUCE");
        LOGONAME.setExcelTitle("LOGONAME");
        POSTERNAME.setExcelTitle("POSTERNAME");
        VIDEOPATH.setExcelTitle("VIDEOPATH");
        FWQRPATH.setExcelTitle("FWQRPATH");
        EQUITYPATH.setExcelTitle("EQUITYPATH");
        LONGITUDE.setExcelTitle("LONGITUDE");
        LATITUDE.setExcelTitle("LATITUDE");
        USEID.setExcelTitle("USEID");
        USENAME.setExcelTitle("USENAME");
        REVEAL.setExcelTitle("REVEAL");
        TYPE.setExcelTitle("TYPE");

        map.add(MERCHANTID);
        map.add(MERCHANTNAME);
        map.add(MERCHANTPHONE);
        map.add(CHARGEPERSON);
        map.add(PERSONPHONE);
        map.add(POSTER);
        map.add(ADDRESS);
        map.add(MERCHANTURL);
        map.add(QRCODEPATH);
        map.add(ORGCODE);
        map.add(AUDITTIME);
        map.add(MERCHANTSTATUS);
        map.add(LOGOPATH);
        map.add(INTRODUCE);
        map.add(LOGONAME);
        map.add(POSTERNAME);
        map.add(VIDEOPATH);
        map.add(FWQRPATH);
        map.add(EQUITYPATH);
        map.add(LONGITUDE);
        map.add(LATITUDE);
        map.add(USEID);
        map.add(USENAME);
        map.add(REVEAL);
        map.add(TYPE);

        List<Map<String, String>> maps = new ArrayList<>();
        List<String> qrcodePathList = new ArrayList<>();
        List<String> logoPathList = new ArrayList<>();
        List<String> posterPathList = new ArrayList<>();
        List<String> merchantPathList = new ArrayList<>();
        List<Merchant> merchants = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        // 先删除数据在插入
        if (maps != null && maps.size() > 0) {
            // 删除数据
            merchantMapper.deleteByExample(new MerchantExample());
            // 插入数据
            maps.forEach(e->{
                MerchantWithBLOBs merchant = new MerchantWithBLOBs();
                merchant.setMerchantid(e.get("MERCHANTID"));
                merchant.setMerchantname(e.get("MERCHANTNAME"));
                merchant.setMerchantphone(e.get("MERCHANTPHONE"));
                merchant.setChargeperson(e.get("CHARGEPERSON"));
                merchant.setPersonphone(e.get("PERSONPHONE"));
                merchant.setPoster(e.get("POSTER"));
                merchant.setAddress(e.get("ADDRESS"));
                merchant.setMerchanturl(e.get("MERCHANTURL"));
                merchant.setQrcodepath(e.get("QRCODEPATH"));
                merchant.setOrgcode(e.get("ORGCODE"));
                merchant.setAudittime("");
                merchant.setMerchantstatus(e.get("MERCHANTSTATUS"));
                merchant.setLogopath(e.get("LOGOPATH"));
                merchant.setIntroduce(e.get("INTRODUCE"));
                merchant.setLogoname(e.get("LOGONAME"));
                merchant.setPostername(e.get("POSTERNAME"));
                merchant.setVideopath(e.get("VIDEOPATH"));
                merchant.setFwqrpath(e.get("FWQRPATH"));
                merchant.setEquitypath(e.get("EQUITYPATH"));
                merchant.setLongitude(e.get("LONGITUDE"));
                merchant.setLatitude(e.get("LATITUDE"));
                merchant.setUseid(e.get("USEID"));
                merchant.setUsename(e.get("USENAME"));
                merchant.setReveal(e.get("REVEAL"));
                merchant.setReveal(e.get("TYPE"));
                merchants.add(merchant);
                merchantMapper.insertSelective(merchant);
                // 二维码
                if (StringUtils.isNotBlank(merchant.getQrcodepath())) {
                    qrcodePathList.add(merchant.getQrcodepath());
                }
                // logo地址
                if (StringUtils.isNotBlank(merchant.getLogopath())) {
                    logoPathList.add(merchant.getLogopath());
                }
                // 海报地址（有可能逗号隔开多个）
                if (StringUtils.isNotBlank(merchant.getPoster())) {
                    List<String> posterPath = Arrays.asList(merchant.getPoster().split(","));
//                if (posterPath.size()>0) {
////                    posterPath.forEach(path->{
////                        posterPathList.add(path);
////                    });
////                }else {
////                    posterPathList.add(merchant.getLogopath());
////                }
                    //使用addall
                    posterPathList.addAll(posterPath);
                }
                // 商户URL
                // todo 确认商户URL，更改为下载视频
                if (StringUtils.isNotBlank(merchant.getVideopath())) {
                    merchantPathList.add(merchant.getVideopath());
                }
            });
            qrcodePathList.addAll(logoPathList);
            qrcodePathList.addAll(posterPathList);
            qrcodePathList.addAll(merchantPathList);
            if (downloadFile(qrcodePathList)) {
                DownloadErrorExample downloadErrorExample = new DownloadErrorExample();
                DownloadErrorExample.Criteria criteria = downloadErrorExample.createCriteria();
                criteria.andProTypeEqualTo("7");
                downLoadErrorService.repeatDownload(downloadErrorMapper.selectByExample(downloadErrorExample));
            }else {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            }
//        downloadFile(qrcodePathList);
//        downloadFile(logoPathList);
//        downloadFile(posterPathList);
//        downloadFile(merchantPathList);
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
            //设置文件传输为二进制
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
                        downloadError.setProName("merchant");
                        downloadError.setProType("7");
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
                return false;
            }catch (Exception e) {
                printErrorMes("登录ftp服务器【"+ip+"】失败", e);
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

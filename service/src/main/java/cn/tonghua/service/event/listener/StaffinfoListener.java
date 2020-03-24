package cn.tonghua.service.event.listener;

import cn.hutool.core.text.StrBuilder;
import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.StaffinfoEvent;
import cn.tonghua.database.mapper.StaffInfoMapper;
import cn.tonghua.database.model.StaffInfo;
import cn.tonghua.database.model.StaffInfoExample;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description远程端同步数据监听器
 */
@Component
public class StaffinfoListener extends AbsLogPrinter {

    @Autowired
    StaffInfoMapper staffInfoMapper;

    /**
     * 本地ftp地址
     */
    @Value("${ftp.local.path}")
    private String localPath;
    /**
     * 微笑打分行员照片
     */
    @EventListener
    @Async
    public void staffinfo(StaffinfoEvent staffinfoEvent){

        FileInputStream in =null;
        try {
            // 行员照片
            in=new FileInputStream(staffinfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle STAFFID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle STAFFNAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle SEX = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle USERNO = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle HONOR = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle VIEWPOINT = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle QRCODEPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ORGCODE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle IDCARD = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ISLINE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle CNNAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle FULLFACEPHOTO = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle POSTERPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PHONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle SMILEPHOTOPATH = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TJPHOTO = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle WELCOME = new ExcelToListMap.TableTitle();


        STAFFID.setToTitle("STAFFID");
        STAFFNAME.setToTitle("STAFFNAME");
        SEX.setToTitle("SEX");
        USERNO.setToTitle("USERNO");
        HONOR.setToTitle("HONOR");
        VIEWPOINT.setToTitle("VIEWPOINT");
        QRCODEPATH.setToTitle("QRCODEPATH");
        ORGCODE.setToTitle("ORGCODE");
        IDCARD.setToTitle("IDCARD");
        ISLINE.setToTitle("ISLINE");
        CNNAME.setToTitle("CNNAME");
        FULLFACEPHOTO.setToTitle("FULLFACEPHOTO");
        POSTERPATH.setToTitle("POSTERPATH");
        PHONE.setToTitle("PHONE");
        SMILEPHOTOPATH.setToTitle("SMILEPHOTOPATH");
        TJPHOTO.setToTitle("TJPHOTO");
        WELCOME.setToTitle("WELCOME");

        STAFFID.setExcelTitle("STAFFID");
        STAFFNAME.setExcelTitle("STAFFNAME");
        SEX.setExcelTitle("SEX");
        USERNO.setExcelTitle("USERNO");
        HONOR.setExcelTitle("HONOR");
        VIEWPOINT.setExcelTitle("VIEWPOINT");
        QRCODEPATH.setExcelTitle("QRCODEPATH");
        ORGCODE.setExcelTitle("ORGCODE");
        IDCARD.setExcelTitle("IDCARD");
        ISLINE.setExcelTitle("ISLINE");
        CNNAME.setExcelTitle("CNNAME");
        FULLFACEPHOTO.setExcelTitle("FULLFACEPHOTO");
        POSTERPATH.setExcelTitle("POSTERPATH");
        PHONE.setExcelTitle("PHONE");
        SMILEPHOTOPATH.setExcelTitle("SMILEPHOTOPATH");
        TJPHOTO.setExcelTitle("TJPHOTO");
        WELCOME.setExcelTitle("WELCOME");

//        map.add(STAFFID);
//        map.add(STAFFNAME);
//        map.add(SEX);
        map.add(USERNO);
//        map.add(HONOR);
//        map.add(VIEWPOINT);
//        map.add(QRCODEPATH);
//        map.add(ORGCODE);
//        map.add(IDCARD);
//        map.add(ISLINE);
        map.add(CNNAME);
//        map.add(FULLFACEPHOTO);
        map.add(WELCOME);
//        map.add(POSTERPATH);
//        map.add(PHONE);
        map.add(SMILEPHOTOPATH);
        map.add(TJPHOTO);

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
        String smilePath = "SmileData\\HYIconPics\\";
        String homeSmilePath = "SmileData\\HomePics\\";
        int flag =1;
        int flagHome =1;
        // 删除
        if (maps.size()>0) {
            staffInfoMapper.deleteByExample(new StaffInfoExample());
        }
        for (Map<String, String> e : maps) {
            StaffInfo staffInfo = new StaffInfo();
            StaffInfo staffInfoHome = new StaffInfo();
//            staffInfo.setStaffid(e.get("STAFFID"));
//            staffInfo.setStaffname(e.get("STAFFNAME"));
//            staffInfo.setSex(e.get("SEX"));
            staffInfo.setUserno(e.get("USERNO"));
//            staffInfo.setHonor(e.get("HONOR"));
            staffInfo.setViewpoint(e.get("WELCOME"));
//            staffInfo.setQrcodepath(e.get("QRCODEPATH"));
            staffInfo.setOrgcode(e.get("ORGCODE"));
            staffInfo.setIsline(null);
            staffInfo.setCnname(e.get("CNNAME"));
//            staffInfo.setFullfacephoto(e.get("FULLFACEPHOTO"));
//            staffInfo.setPosterpath(e.get("POSTERPATH"));
//            staffInfo.setPhone(e.get("PHONE"));

            // 判断首页
            if (StringUtils.isNotBlank(e.get("SMILEPHOTOPATH"))) {

                staffInfoHome.setSmilephotopath(e.get("SMILEPHOTOPATH"));
                StrBuilder strBuilderHome = new StrBuilder();
                strBuilderHome.append(homeSmilePath);
                strBuilderHome.append(String.valueOf(flagHome));
                strBuilderHome.append(".png");
                staffInfoHome.setTmpPath(strBuilderHome.toString());
                staffInfoHome.setPhotoType(2);
                staffInfos.add(staffInfoHome);
                flagHome = flagHome + 1;
            }
            // 判断推荐微笑
            if (StringUtils.isNotBlank(e.get("TJPHOTO"))) {
                staffInfo.setTjphoto(e.get("TJPHOTO"));
                StrBuilder strBuilder = new StrBuilder();
                strBuilder.append(smilePath);
                strBuilder.append(String.valueOf(flag));
                strBuilder.append(".png");
                staffInfo.setTmpPath(strBuilder.toString());
                staffInfo.setPhotoType(1);
                staffInfos.add(staffInfo);
                staffInfoMapper.insertSelective(staffInfo);
                flag = flag + 1;
            }
        }
        String txtPath = localPath +"SmileData\\HYWelComeMessage.txt";
        // 下载
        String content = downloadFile(staffInfos);
        if (StringUtils.isNotBlank(content)) {
            writeTxt(txtPath,content);
        }
    }

    @Value("${ftp.username}")
    private String userName;

    @Value("${ftp.password}")
    private String passWord;

    @Value("${ftp.host}")
    private String ip;

    @Value("${ftp.port}")
    private int port;


    // ftp客户端
    private FTPClient ftpClient = new FTPClient();

    private String downloadFile(List<StaffInfo> staffInfos){

        if(!connectToServer()) {
            return "";
        }
        StrBuilder strBuilder = new StrBuilder();
        try {
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//            String localPath = "D:\\ftpserver\\";
            // 拼接要打印到txt里面的对应评语
            AtomicBoolean flag= new AtomicBoolean(true);
            AtomicBoolean flagHome= new AtomicBoolean(true);
            staffInfos.forEach(e->{
                InputStream in=null;
                try {
                    // 1代表推荐语，2首页微笑图片
                    if (2== e.getPhotoType()) {
                        in=ftpClient.retrieveFileStream(e.getSmilephotopath());
                    } else {
                        in = ftpClient.retrieveFileStream(e.getTjphoto());
                    }

                    if (in !=null) {

                        if (1== e.getPhotoType()) {
                            if (flag.get()) {
                                flag.set(false);
                                CommonGroupUtils.deleteDir(localPath+"SmileData\\HYIconPics");
                            } else {
                                strBuilder.append("||");
                            }
                            strBuilder.append(StringUtils.isNotBlank(e.getViewpoint())?e.getViewpoint():"青岛欢迎您");
                        }
                        // 创建文件目录
//                        CommonGroupUtils.makeDir(localPath+CommonGroupUtils.pathFiter(e.getTmpPath()));
                        // 删除smile文件夹下员工照片第一次删除
                        if (2==e.getPhotoType()&&flagHome.get()) {
                            CommonGroupUtils.deleteDir(localPath+"SmileData\\HomePics");
                            flagHome.set(false);
                        }
                        BufferedOutputStream out=null;
                        in=new BufferedInputStream(in);
                        out=new BufferedOutputStream(new FileOutputStream(localPath+e.getTmpPath()));
                        int len=-1;
                        byte[] b=new byte[1024];
                        while((len=in.read(b))!=-1){
                            out.write(b,0,len);
                        }
                        in.close();
                        ftpClient.completePendingCommand();
                        out.close();
                        printInfoMes("sucess"+e.getTmpPath());

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
        return strBuilder.toString();
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
}

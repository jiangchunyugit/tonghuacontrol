package cn.tonghua.web.test;

import cn.hutool.core.io.resource.ClassPathResource;
import cn.tonghua.database.mapper.SiteInfoMapper;
import cn.tonghua.database.model.SiteInfoExample;
import cn.tonghua.database.vo.SiteVO;
import cn.tonghua.service.utils.*;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StartTest {

    /**
     * main方法，发送UDP广播，实现远程开机，目标计算机的MAC地址为：‎44032CEDC37B
     */
    public static void main(String[] args) {
        String ip = "255.255.255.255";//广播IP地址
        int port = 9;//端口号
        //魔术包数据
        String magicPacage = "0xFFFFFFFFFFFF" +
                "144F8AEBEOF6" + "144F8AEBEoF6" + "144F8AEBEOF6" + "144F8AEBEOF6" +
                "144F8AEBEOF6" + "144F8AEBEOF6" + "144F8AEBEOF6" + "144F8AEBEOF6" +
                "144F8AEBEOF6" + "144F8AEBEOF6" + "144F8AEBEOF6" + "144F8AEBEOF6" +
                "144F8AEBEOF6" + "144F8AEBEOF6" + "144F8AEBEOF6" + "144F8AEBEOF6";
        //转换为2进制的魔术包数据
        byte[] command = hexToBinary(magicPacage);

        //广播魔术包
        try {
            //1.获取ip地址
            InetAddress address = InetAddress.getByName(ip);
            //2.获取广播socket
            MulticastSocket socket = new MulticastSocket(port);
            //3.封装数据包
            /*public DatagramPacket(byte[] buf,int length
             *      ,InetAddress address
             *      ,int port)
             * buf：缓存的命令
             * length：每次发送的数据字节数，该值必须小于等于buf的大小
             * address：广播地址
             * port：广播端口
             */
            DatagramPacket packet = new DatagramPacket(command, command.length, address, port);
            //4.发送数据
            socket.send(packet);
            //5.关闭socket
            socket.close();
        } catch (UnknownHostException e) {
            //Ip地址错误时候抛出的异常
            e.printStackTrace();
        } catch (IOException e) {
            //获取socket失败时候抛出的异常
            e.printStackTrace();
        }
    }

    /**
     * 将16进制字符串转换为用byte数组表示的二进制形式
     * @param hexString：16进制字符串
     * @return：用byte数组表示的十六进制数
     */
    private static byte[] hexToBinary(String hexString){
        //1.定义变量：用于存储转换结果的数组
        byte[] result = new byte[hexString.length()];

        //2.去除字符串中的16进制标识"0X"并将所有字母转换为大写
        hexString = hexString.toUpperCase().replace("0X", "");

        //3.开始转换
        //3.1.定义两个临时存储数据的变量
        char tmp1 = '0';
        char tmp2 = '0';
        //3.2.开始转换，将每两个十六进制数放进一个byte变量中
        for(int i = 0; i < hexString.length(); i += 2){
            result[i/2] = (byte)((hexToDec(tmp1)<<4)|(hexToDec(tmp2)));
        }
        return result;
    }

    /**
     * 用于将16进制的单个字符映射到10进制的方法
     * @param c：16进制数的一个字符
     * @return：对应的十进制数
     */
    private static byte hexToDec(char c){
        return (byte)"0123456789ABCDEF".indexOf(c);
    }

    @Autowired
    SiteInfoMapper siteInfoMapper;

    @Test
    public void testguangda() {

//            SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
//            Calendar calendar=Calendar.getInstance();
//            calendar.add(Calendar.MONTH, -3);
//            calendar.set(Calendar.DAY_OF_MONTH, 1);
//            System.out.print(format1.format(calendar.getTime()));
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("channel", "999");//渠道号，系统真实所属渠道编号
//        param.put("tradingCode", "V001");//交易码 默认V001
//        param.put("orgCode", "3550");//机构号，传真实机构号
//        param.put("staticDb", "BJZT01");//底库编号,1.上海互动墙传SHZT01，2.北京互动墙传BJZT01
//        param.put("sceneImg", "");//现场照,图片大小小于100K，并且人脸图像清晰，不要出现多人脸情况
//        String signStr = "FRS_850_V001_IBISVIP";//FRS_渠道号_交易码_IBISVIP
//        param.put("signature", Md5.md5(signStr));//签名
//        System.out.print(new Gson().toJson(param));

        String imgPath ="D:\\test.xlsx";
        FileInputStream in =null;
        try {
            in=new FileInputStream(imgPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        ExcelToListMap.TableTitle tableTitle = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle tableTitle1 = new ExcelToListMap.TableTitle();
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        map.add(tableTitle);
        tableTitle.setExcelTitle("title1");
        tableTitle1.setExcelTitle("title2");
        tableTitle.setToTitle("title1");
        tableTitle1.setToTitle("title2");
        map.add(tableTitle1);
        List<Map<String, String>> maps = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
            System.out.print("a");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();

        }

//        data=new byte[in.available()];
//        try {
//
//            ClassPathResource classPathResource = new ClassPathResource("classpath:/sensitivetmp/SensitiveWords.txt");
//            InputStream inputStream = classPathResource.getStream();
//
//            //输出文件
//            InputStream is = new BufferedInputStream(in);
////            InputStream is = Thread.currentThread().getContextClassLoader()
////                    .getResourceAsStream("SensitiveWords.txt");
//
//            InputStreamReader read = new InputStreamReader(is,"GBK");
//            BufferedReader bufferedReader = new BufferedReader(read);
//            String lineTxt;
//            while ((lineTxt = bufferedReader.readLine()) != null) {
//                lineTxt = lineTxt.trim();
//            }
//            read.close();
//        } catch (Exception e) {
//            System.out.print("失败");
////            logger.error("读取敏感词文件失败" + e.getMessage());
//        }

//        ExcelData data = new ExcelData();
//        String title = "合同信息数据";
//        data.setName(title);
//        //添加表头
//        List<String> titles = new ArrayList<>();
//        titles.add("序号");
//        titles.add("比列编号");
//        titles.add("比列名称");
//        titles.add("比列有效期");
//        titles.add("创建时间");
//        titles.add("创建人");
//        titles.add("比列状态");
//        titles.add("备注");
//        titles.add("比例(%)");
//        titles.add("金额（元）");
//        data.setTitles(titles);
        //添加列
//        List<List<Object>> rows = new ArrayList<>();
//        List<Object> row = null;
//        PageHelper.startPage(ratio.getPage(), ratio.getRows());
//        SettlementRatioInfoExample example = new SettlementRatioInfoExample();
//        searchRef(example, ratio);
//        List<SettlementRatioInfo> list = settlementRatioInfoMapper.selectByExample(example);
//        for(int i=0; i<list.size();i++){
//            row=new ArrayList<>();
//            row.add(i+1);
//            row.add(list.get(i).getRatioNumber());
//            row.add(list.get(i).getFeeName());
//            row.add(DateUtils.dateToDateTime(list.get(i).getEffectStartTime())+"———"+DateUtils.dateToDateTime(list.get(i).getEffectStartTime()));
//            row.add(DateUtils.dateToDateTime(list.get(i).getCreateTime()));
//            row.add(list.get(i).getCreateUser());
//            row.adEd(SettlementStatus.getDesc(list.get(i).getStatus()));
//            row.add(list.get(i).getRemark());
//            row.add(list.get(i).getRatio());
//            row.add(list.get(i).getAmount());
//            rows.add(row);
////        }
//        data.setRows(rows);
//        SimpleDateFormat fdate=new SimpleDateFormat("yyyy-MM-dd-HHmmss");
//        String fileName=title+"_"+fdate.format(new Date())+".xls";
//        File pathDir= new File("D:\\jjj" );
//        if(!pathDir.exists()){
//            pathDir.mkdirs();
//        }
//        try {
//            ExcelUtils.generatexcel(data,"D:\\jjj\\" +
//                    ""+fileName);
//        } catch (Exception e) {
////            printErrorMes("结算比列导出异常",e.getMessage());
//        }







    }


}

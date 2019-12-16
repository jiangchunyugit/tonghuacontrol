package cn.tonghua.service.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * base64的工具类
 * @author qinlinsen
 */
@SuppressWarnings("restriction")
public class Base64Util {
    public static String getImgBase64CodeStr(String imgPath){
        byte[] data=null;
        FileInputStream in =null;
        try {
            in=new FileInputStream(imgPath);
            data=new byte[in.available()];
            in.read(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);
    }

    public static boolean generateImage(String imageBase64Str,String path){
        if(imageBase64Str==null){
            return  false;
        }
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            byte[] bytes = base64Decoder.decodeBuffer(imageBase64Str);
            for(int i=0;i<bytes.length;i++){
                if(bytes[i]<0){
                    bytes[i]+=256;
                }
            }
            FileOutputStream out = new FileOutputStream(path);
            out.write(bytes);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        String imgStr = getImgBase64CodeStr("D:\\ren.jpg");
        System.out.println(imgStr);
    }

    public static Integer imageSize(String image){
        if (image.length()<22) {
            return 100;
        }
        String str=image.substring(22);// 1.需要计算文件流大小，首先把头部的data:image/png;base64,（注意有逗号）去掉。
        Integer equalIndex= str.indexOf("=");//2.找到等号，把等号也去掉
        if(str.indexOf("=")>0) {
            str=str.substring(0, equalIndex);
        }
        Integer strLength=str.length();//3.原来的字符流大小，单位为字节
        Integer size=strLength-(strLength/8)*2;//4.计算后得到的文件流大小，单位为字节
        return size;
    }
}

package cn.tonghua.service.utils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.*;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;

public class CommonGroupUtils {

	/**
     * 分組依據接口，用于集合分組時，獲取分組依據
     * 
     * @author ZhangLiKun
     * @title GroupBy
     * @date 2013-4-23
     */
    public interface GroupBy<T> {
        T groupby(Object obj);
    }

    /**
     * 
     * @param colls
     * @param gb
     * @return
     */
    public static final <T extends Comparable<T>, D> Map<T, List<D>> group(Collection<D> colls, GroupBy<T> gb) {
        if (colls == null || colls.isEmpty()) {
            System.out.println("分組集合不能為空!");
            return null;
        }
        if (gb == null) {
            System.out.println("分組依據接口不能為Null!");
            return null;
        }
        Iterator<D> iter = colls.iterator();
        Map<T, List<D>> map = new HashMap<T, List<D>>();
        while (iter.hasNext()) {
            D d = iter.next();
            T t = gb.groupby(d);
            if (map.containsKey(t)) {
                map.get(t).add(d);
            } else {
                List<D> list = new ArrayList<D>();
                list.add(d);
                map.put(t, list);
            }
        }
        return map;
    }
    /**
     * 将List<V>按照V的methodName方法返回值（返回值必须为K类型）分组，合入到Map<K, List<V>>中<br>
     * 要保证入参的method必须为V的某一个有返回值的方法，并且该返回值必须为K类型
     * 
     * @param list
     *            待分组的列表
     * @param map
     *            存放分组后的map
     * @param clazz
     *            泛型V的类型
     * @param methodName
     *            方法名
     */
    public static <K, V> void listGroup2Map(List<V> list, Map<K, List<V>> map, Class<V> clazz, String methodName) {
        // 入参非法行校验
        if (null == list || null == map || null == clazz || StringUtils.isEmpty(methodName)) {
            System.out.print("CommonUtils.listGroup2Map 入参错误，list：" + list + " ；map：" + map + " ；clazz：" + clazz + " ；methodName：" + methodName);
            return;
        }

        // 获取方法
        Method method = getMethodByName(clazz, methodName);
        // 非空判断
        if (null == method) {
            return;
        }

        // 正式分组
        listGroup2Map(list, map, method);
    }

    /**
     * 根据传进来的时间返回corn表达式 HH:MM:SS->"0 mm hh * * ?"每天几点过几分运行
     * @param time
     * @return
     */
    public static String getCorn(String time) {
        if (time.length() == 8) {
            String [] timeList = time.split(":");
            if (timeList.length >2){
                StringBuffer stringBuffer = new StringBuffer();
                if (timeList[0].length() == 2) {
                    String hh;
                    if (timeList[0].substring(0,1).equals("0")) {
                        hh= timeList[0].substring(1,2);
                    } else {
                        hh = timeList[0];
                    }
                    if (timeList[1].length() == 2) {
                        String mm;
                        if (timeList[1].substring(0,1).equals("0")) {
                            mm= timeList[1].substring(1,2);
                        } else {
                            mm = timeList[1];
                        }
                        stringBuffer.append("0 ");
                        stringBuffer.append(mm);
                        stringBuffer.append(" ");
                        stringBuffer.append(hh);
                        stringBuffer.append(" * * ?");
                        return stringBuffer.toString();
                    }
                }
            }
        }
        return null;
    }
	/**
     * 根据类和方法名，获取方法对象
     * 
     * @param clazz
     * @param methodName
     * @return
     */
    public static Method getMethodByName(Class<?> clazz, String methodName) {
        Method method = null;
        // 入参不能为空
        if (null == clazz || !StringUtils.isEmpty(methodName)) {
            System.out.print("CommonUtils.getMethodByName 入参错误，clazz：" + clazz + " ；methodName：" + methodName);
            return method;
        }

        try {
            method = clazz.getDeclaredMethod(methodName);
        } catch (Exception e) {
            System.out.print("类获取方法失败！");
        }

        return method;
    }
    /**
     * 将List<V>按照V的某个方法返回值（返回值必须为K类型）分组，合入到Map<K, List<V>>中<br>
     * 要保证入参的method必须为V的某一个有返回值的方法，并且该返回值必须为K类型
     * 
     * @param list
     *            待分组的列表
     * @param map
     *            存放分组后的map
     * @param method
     *            方法
     */
    @SuppressWarnings("unchecked")
    public static <K, V> void listGroup2Map(List<V> list, Map<K, List<V>> map, Method method) {
        // 入参非法行校验
        if (null == list || null == map || null == method) {
            System.out.print("CommonUtils.listGroup2Map 入参错误，list：" + list + " ；map：" + map + " ；method：" + method);
            return;
        }

        try {
            // 开始分组
            Object key;
            List<V> listTmp;
            for (V val : list) {
                key = method.invoke(val);
                listTmp = map.get(key);
                if (null == listTmp) {
                    listTmp = new ArrayList<V>();
                    map.put((K) key, listTmp);
                }
                listTmp.add(val);
            }
        } catch (Exception e) {
            System.out.print("分组失败！");
        }
    }


    /**
     * 删除文件
     * @param path
     * @return
     */
    public static boolean deleteDir(String path) {
        File file = new File(path);
        // 判断是否待删除目录是否存在
        if (!file.exists()) {
            return false;
        }
        // 取得当前目录下所有文件和文件夹
        String[] content = file.list();
        for (String name : content) {
            File temp = new File(path, name);
            // 判断是否是目录
            if (temp.isDirectory()) {
                // 递归调用，删除目录里的内容
                deleteDir(temp.getAbsolutePath());
                temp.delete();
            } else {
                temp.delete();// 删除文件
            }
        }
        return true;
    }

    /**
     * 创建文件地址
     * @param path
     * @return
     */
    public static boolean makeDir(String path) {
        File file = new File(path);
        // 判断是否待删除目录是否存在
        if (!file.exists()) {
            file.mkdirs();
        }
        return true;
    }

    /**
     * 取出双引号之前的文件路径
     * @param url
     * @return
     */
    public static String pathFiter(String url) {
        String procName = url.substring(0,url.lastIndexOf("/")+1);
        return procName.replace("/","\\");
    }

    /**
     * 债券类型
     */
    public static String bondinfoConvert (String zqlb) {
        if (zqlb.equals("A")) {
            return "记账式";
        }
        return "电子式";
    }

    /**
     * 币种转换
     */
    public static String moneyConvert (String zqlb) {
        if (zqlb.equals("CNY")) {
            return "人民币";
        }
        return "";
    }

    /**
     * 将16进制字符串转换为用byte数组表示的二进制形式
     * @param hexString：16进制字符串
     * @return：用byte数组表示的十六进制数
     */
    public static byte[] hexToBinary(String hexString){
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase().replace("0X", "");
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    /**
     * Convert char to byte
     * @param c char
     * @return byte
     */
    public static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }
}

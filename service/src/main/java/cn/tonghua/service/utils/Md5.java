package cn.tonghua.service.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：md5加密处理类
 **/
public class Md5 {

	protected static final Logger logger = LoggerFactory.getLogger(Md5.class); 
	
	/**
	 * 功能：根据指定的散列算法名，得到字符串的散列结果。
	 *
	 * @return
	 */
	private static String digest(String src) throws Exception {
		try {
			byte[] result = digest.digest(src.getBytes());
			StringBuilder hs = new StringBuilder();
			String stmp = "";
			for (int n = 0; n < result.length; n++) {
				stmp = (Integer.toHexString(result[n] & 0XFF));
				if (stmp.length() == 1) {
					hs.append("0" + stmp);
				} else {
					hs.append(stmp);
				}
			}
			return hs.toString().toUpperCase();
		} catch (Exception ex) {
			throw ex;
		}
	}

	/**
	 * 功能：计算字符串的md5值
	 *
	 * @param src
	 * @return
	 */
	public static String md5(String src) {
		String value = null;
		try {
			value = digest(src);
		} catch (Exception e) {
//			logger.error(StaticConstants.log_md5EncryptException, e);
		}
		return value;
	}
	//大文件计算MD5
    public static String md5Hex(InputStream data) throws IOException {
        return DigestUtils.md5Hex(data);
    }
	private static MessageDigest digest = null;

	static {
		try {
			digest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
//			logger.error(StaticConstants.log_md5EncryptException, e);
		}
	}
}

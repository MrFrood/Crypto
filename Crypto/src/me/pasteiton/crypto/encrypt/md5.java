package me.pasteiton.crypto.encrypt;

import java.security.MessageDigest;
import me.pasteiton.crypto.utils.UtilWrapper;

public class md5 {
	
	public static UtilWrapper uw = new UtilWrapper();
	
	/**
	 * Turns value into md5 hash. 
	 * Note: Irreversible.
	 * @param value
	 * @return md5 hash
	 */
	public static String md5Hash(String value) {
		try {
			byte[] hash = MessageDigest.getInstance("MD5").digest(value.getBytes());
			return uw.getByteHexConverter().byteToHex(hash);
		}catch(Exception e) { }
		return "";
	}
	
	
}

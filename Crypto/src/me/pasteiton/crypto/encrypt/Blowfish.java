package me.pasteiton.crypto.encrypt;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Blowfish {
	
	private static String KEY = "(i4J$2Jwg6387"; // 128
	
	/**
	 * Encrypts String with Blowfish using given key
	 * @param key
	 * @param data
	 * @return Blowfish encrypted String
	 */
	public String encryptBlowfishWithKey(String key, String data) {
		try {
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, skey);
			byte[] newData = data.getBytes();
			return cipher.doFinal(newData).toString();
		}catch(Exception e) { }
		return data;
	}
	
	/**
	 * Encrypts String with Blowfish using predefined key
	 * @param data
	 * @return Blowfish encrypted String
	 */
	public String encryptBlowfishWithoutKey(String data) {
		try {
			SecretKeySpec skey = new SecretKeySpec(KEY.getBytes(), "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, skey);
			byte[] newData = data.getBytes();
			return cipher.doFinal(newData).toString();
		}catch(Exception e) { }
		return data;
	}
	
	/**
	 * Decrypts String using predefined key
	 * Note: Will not work if not the same key as the one it was encrypted with
	 * @param data
	 * @return Decrypted String
	 */
	public String decryptBlowfishWithoutKey(String data) {
		try {
			SecretKeySpec skey = new SecretKeySpec(KEY.getBytes(), "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE, skey);
			byte[] newData = data.getBytes();
			return cipher.doFinal(newData).toString();
		}catch(Exception e) { }
		return "";
	}
	
	/**
	 * Decrypts String using given key
	 * Note: Will not work if not the same key as the one it was encrypted with
	 * @param key
	 * @param data
	 * @return Decrypted String
	 */
	public String decryptBlowfishWithKey(String key, String data) {
		try {
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE, skey);
			byte[] newData = data.getBytes();
			return cipher.doFinal(newData).toString();
		}catch(Exception e) { }
		return "";
	}
	
	
	
	
}

package me.pasteiton.crypto.encrypt;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@SuppressWarnings("unused")
public class AESEncrypt {
	
	private static final String KEY = "(i4J$2Jwg6387"; // 128
	private static final String KEY_2 = "0B4wCr5N2OxG93qh";
	
	/**
	 * Encrypts data with AES using given key
	 * @param key
	 * @param data
	 * @return AES encrypted data
	 */
	public String encryptWithKey(String key, String data) {
		try {
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
			byte[] newData = data.getBytes();
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, skey);
			return cipher.doFinal(newData).toString();
		}catch(Exception e) { }
		return data.toString();
	}
	
	/**
	 * Encrypts key with AES using predefined key
	 * @param data
	 * @return AES encrypted data
	 */
	public String encryptWithoutKey(String data) {
		try {
		byte[] newData = data.getBytes();
		SecretKeySpec skey = new SecretKeySpec(KEY.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, skey);
		return cipher.doFinal(newData).toString();
	
		}catch(Exception e) { }
		return data;
	}
	
	/**
	 * Decrypts with the given key. 
	 * Note: Will not work if it is not encrypted using that key
	 * @param key
	 * @param data
	 * @return Decrypted data
	 */
	public String decryptWithKey(String key, String data) { 
		try {
			byte[] newData = data.getBytes();
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, skey);
			return cipher.doFinal(newData).toString();
		}catch(Exception e) { }
		return data;
	}
	
	/**
	 * Decrypts with the predfined key.
	 * Note: Will not work if it is not encrypted using that key
	 * @param data
	 * @return Decrypted data
	 */
	
	public String decryptWithoutKey(String data) {
		try {
		byte[] newData = data.getBytes();
		SecretKeySpec skey = new SecretKeySpec(KEY.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, skey);
		return cipher.doFinal(newData).toString();
	
		}catch(Exception e) { }
		return data;
	}
	
	
}

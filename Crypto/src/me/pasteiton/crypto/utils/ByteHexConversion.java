package me.pasteiton.crypto.utils;

public class ByteHexConversion {
	
	/**
	 * Converts bytes to hex
	 * @param input
	 * @return Hex String
	 */
	public String byteToHex(byte[] input) {
		StringBuffer stringBuff = new StringBuffer(input.length * 2);
		for(byte element : input) {
			if((element & 0xff) < 0x10) {
				stringBuff.append("0");
			}
			stringBuff.append(Long.toString(element & 0xff, 16));
		}
		
		return stringBuff.toString().toUpperCase();
	}
	
	/**
	 * Converts hex to bytes
	 * @param input
	 * @return bytes
	 */
	public byte[] hexToByte(String input) {
		byte[] bytes = new byte[input.length() / 2];
		for(int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) Integer.parseInt(input.substring(2 * i, 2 * i + 2), 16);
		}
		
		return bytes;
	}
	
}

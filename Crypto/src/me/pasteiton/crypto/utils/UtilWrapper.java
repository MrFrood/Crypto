package me.pasteiton.crypto.utils;

public class UtilWrapper {
	
	private ByteHexConversion bhc;
	
	public ByteHexConversion getByteHexConverter() {
		if(this.bhc == null) {
			this.bhc = new ByteHexConversion();
		}
		return this.bhc;
	}
	
	
	
}

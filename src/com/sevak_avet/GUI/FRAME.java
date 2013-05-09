package com.sevak_avet.GUI;

public enum FRAME {
	VERSION_ENCRYPT("Cezar Encryption v1.0a"),
	VERSION_DECRYPT("Cezar Decryption v1.0a"),
	BUTTON_ENCRYPT("Encrypt"),
	BUTTON_DECRYPT("Decrypt"),
	WIDTH(390),
	HEIGHT(290);
	
	private String version;
	private int size;
	
	public String getText() {
		return version;
	}
	
	public int getSize(){
		return size;
	}
	
	
	FRAME(String str){
		version = str;
	}
	
	FRAME(int i){
		size = i;
	}
	
	
}

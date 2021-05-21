package org.douzone1.aopTest;

public class Assembler {
	private FileEncryptor fileEnc;
	private Encryptor enc;
	
	public Assembler() {
		enc = new Encryptor();
		fileEnc = new FileEncryptor(enc);
	}
	
	public FileEncryptor fileEncryptor() {
		return fileEnc;
	}
	
	public Encryptor encryptor() {
		return enc;
	}

}

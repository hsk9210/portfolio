package org.douzone1.aopTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileEncryptor {
	private Encryptor enc;
	public FileEncryptor(Encryptor enc) {
		this.enc = enc;
	}
	
	public void encrypt(File src, File target) throws IOException{
		try {
			FileInputStream is = new FileInputStream(src);
			FileOutputStream os = new FileOutputStream(target);
			byte data[] = new byte[512];
			int len = -1;
			while ( (len = is.read(data)) != -1) {
				enc.encrypt(data, 0, len);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

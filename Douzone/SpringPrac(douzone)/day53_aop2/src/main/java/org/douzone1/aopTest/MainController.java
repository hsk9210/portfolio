package org.douzone1.aopTest;

import java.io.File;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryptor enc = new Encryptor();
		FileEncryptor fileEncryptor = new FileEncryptor(enc);
		try {
			fileEncryptor.encrypt(new File(args[0]), new File(args[1]));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Assembler ass = new Assembler();
		FileEncryptor fileEnc = ass.fileEncryptor();
		Encryptor enc2=  ass.encryptor();
		//fileEnc.encrypt(src, target);

	}

}

package org.douzone1.aopTest;

import java.io.File;
import java.io.IOException;

public class TestFileEncryptor {
	Encryptor fake = new Encryptor() {
		//encryptor.encrypt() 가짜 구현
		@Override
		public void encrypt(byte data[], int offset, int len) {
			for(int i=offset;i<len;i++) {
				data[i] = (byte) (data[i] + 10);
			}
		}
	};
	
	
	//진짜 encryptor 없이 FileEncryptor를 테스트
	FileEncryptor fileEncryptor = new FileEncryptor(fake) ;
	
	public void testFileEncryptor() {
		try {
			//가짜구현 fakeEncryptor 이용
			fileEncryptor.encrypt(new File("required"), new File("required"));
			//... targetFile에 생성된 데이터 내용 확인하여 테스트 완료.
		} catch(IOException ex){
			ex.printStackTrace();
		}
		
	}

		
}





package org.douzone1.aopTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePrinter {
	public void print(String filePath) throws IOException{
		//의존하는 타입을 로컬 변수로 정의
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line = null;
			line = br.readLine();
			while (line != null) {
				System.out.println(line);				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

package ex02.IOIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream1 {

	public OutputStream1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * write(int a) 메소드는 매개 변수로 주어진 값에서
		 * 끝의 1바이트만 출력 스트림으로 보낸다.
		 * 
		 */
		
		try {
			
			OutputStream os = new FileOutputStream("C:\\Users\\MSI1\\Documents\\eclipse-workspace\\day25_ioo\\src/text.txt");

//			byte data[] = "ABC".getBytes();
//			for(int i=0;i<data.length;i++) {
//				os.write(data[i]);
//				System.out.println();
//			}
			byte data[] = "ABCde".getBytes();
			os.write(data,2,3);
			os.write(data,0,2);
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

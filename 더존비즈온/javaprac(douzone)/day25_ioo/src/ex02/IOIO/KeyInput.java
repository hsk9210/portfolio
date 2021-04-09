package ex02.IOIO;

import java.io.IOException;
import java.io.InputStream;

public class KeyInput {

	public KeyInput() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		InputStream is = System.in; //standard input
		try {
			
//			int in = is.read()-48;
//			int in2 = is.read()-48;
//			System.out.println(in+in2);
//			is.close();
			int readByte;
			byte readBytes[] = new byte[100];
			while ((readByte=is.read(readBytes)) != -1) {
				System.out.print((char)readByte+" ");
								
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

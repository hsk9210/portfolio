package ex02.IOIO;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class SystemOutExample {

	public SystemOutExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os = System.out;
		
		for(byte b=48;b<58;b++) {
			os.write(b);
		}
		os.write(10); //라인피드 10을 적으면 다음 행으로 넘긴다.
		for(byte b=97;b<123;b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul=  "가나다라마바";
		byte hangulBytes[] = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		PrintStream ps = System.out;
		ps.println();
		ps.println(hangul);

	}

}

package ex02.IOIO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SystemInExample1 {

	public SystemInExample1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//StringBuffer 변수로 저장해서 바로 출력하는 경우.
//		Scanner input = new Scanner(System.in);
//		System.out.println("Scanner InputStream: ");
//		StringBuffer sb = new StringBuffer(input.nextLine());
//		System.out.println("stored in StringBuffer: "+sb);
		
		InputStream is = System.in;
		byte buffer[] = new byte[1024*8];
		System.out.println("input inputStream?: ");
		int n = is.read(buffer);
		
		String name = new String(buffer, 0, n-2);
		
//		System.out.println(n);
		
		//인코딩 깨진다???
//		for(int i=0;i<n;i++) {
//			System.out.print((char)buffer[i]+" ");			
//		}
		
		//그냥 통짜 String은 안깨지는데...
		//한글 한글자당 3~4byte로 input이 들어오는군.
		System.out.println(n);
		System.out.println(name);
		
		
		

	}

}

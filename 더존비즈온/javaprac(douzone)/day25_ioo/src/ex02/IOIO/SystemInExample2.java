package ex02.IOIO;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample2 {

	public SystemInExample2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// inputStream으로 일단 받아와서,
		InputStream is = System.in;
		byte datas[] =new byte[1024];
		System.out.println("name: ");
		int nameBytes = is.read(datas);
		System.out.println("text: ");
		int commentBytes = is.read(datas);
		
		/* 1. new String으로 변환.
		 * 끝의 2바이트는 enter키의 해당 캐리지리턴(13)과 라인피드(10)을 제외한다.
		 * new String으로 byte로된 데이터를 일괄 변환.
		 * 변수 하나당 한줄로 끝낼 수 있다.
		 */
		//-----------------------------------------------
		String name=  new String(datas, 0, nameBytes-2);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("input name: "+name);
		System.out.println("input comments: "+comment);
		//-----------------------------------------------
		/* 2.
		 * new String(byte[], 0, endIndex, Charset); 
		 * 대신 byte를 그대로 쓰려고 하면?
		 * 음...
		 */
		String aaa  = "";
		for(int i=0;i<datas.length;i++) {	
			
			aaa+=(char)datas[i];
		}
		System.out.println("byte 배열을 그대로 쓰려 한다면...: "+aaa.substring(0, aaa.length()-2));
		//------------------------------------------------

	}

}

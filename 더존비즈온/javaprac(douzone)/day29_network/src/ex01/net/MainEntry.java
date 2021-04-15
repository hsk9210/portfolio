package ex01.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("site address= ");
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		
		String strurl = null;
		InetAddress address2[];
		
		
		try {
			
			strurl = br.readLine(); //
			
			address2 = InetAddress.getAllByName(strurl);
			for(int i=0;i<address2.length;i++) {
				System.out.println(address2[i]);
			}
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		// TODO Auto-generated method stub
		//String host = "192.168.20.12"; //127.0.0.1
//		String host = "23.51.28.215";
//		
//		
//		try {
//			InetAddress address[] = InetAddress.getAllByName(host);
//			
//			for(InetAddress item: address) {
//				System.out.println(item.getHostAddress());
//				System.out.println(item.getAllByName(host));
//				System.out.println(item.getCanonicalHostName());
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		

	}

}

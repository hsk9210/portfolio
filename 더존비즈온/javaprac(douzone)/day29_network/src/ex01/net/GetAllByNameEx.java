package ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx {

	public GetAllByNameEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		address = InetAddress.getByName("www.naver.com");
		System.out.println(address.getHostName()+" "+address.getHostAddress());
		
		byte addr[] = new byte[4];
		addr[0] = (byte)192; addr[1] = (byte)168; addr[2] = (byte)20; addr[3] = (byte)12;
		address = InetAddress.getByAddress(addr);
		System.out.println(address.getCanonicalHostName());
		
		address = InetAddress.getByName("www.daum.net");
		System.out.println(address.getHostName()+" "+address.getHostAddress()+" "+address.getAddress());

	}

}

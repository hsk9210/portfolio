package ex02.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
	
	private final static int PACKETSIZE = 100;

	public UdpClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds = null;

		
		try {
			//1. host를 그냥 수기입력?
//			InetAddress host = InetAddress.getByName(args[0]);
			InetAddress host = InetAddress.getByName("DESKTOP-h2v6l54");
//			byte addr2[] = "192.168.20.26".getBytes();
//			InetAddress host= InetAddress.getByAddress(addr2);
			if(host.getHostName() ==null) {
				System.out.println("using: datagramserver host, port number: " );
				return;
			}
			//2. 포트도.
			int port=  7000;//Integer.parseInt(args[1]);
			ds = new DatagramSocket();
			byte data[] = "hello server busan information class th1".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length,host,port);
			ds.send(dp);
			
			ds.setSoTimeout(2000);
			dp.setData(new byte[PACKETSIZE]);
			System.out.println(new String(dp.getData()));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(ds !=null) ds.close();
		}
		

	}

}

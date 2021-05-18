package ex02.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
	private final static int PACKETSIZE = 100;

	public UdpServer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length!=1) {
//			System.out.println("using: datagramserver port number: " );
//			return;
//		}
		
		try {
			int port=  7000;//Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("the server is ready..");
			for(;;) {
				DatagramPacket dp = new DatagramPacket(new byte[PACKETSIZE], PACKETSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress() +" "+dp.getPort()+" "+new String(dp.getData()));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

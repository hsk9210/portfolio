package ex01.net.udp;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer {

	public DatagramServer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds  =null;
		DatagramPacket dp = null;
		DataOutputStream dos = null;
		
		int port = 5000;
		String str;
		File file =null;
		try {
			System.out.println("UDP file server on.");
			ds = new DatagramSocket(port);
			
			while (true) {
				dp = new DatagramPacket(new byte[65536], 65536);
				ds.receive(dp); //수신
				
				str=  new String(dp.getData(), 0, dp.getLength()).trim();
				
				if(str.equalsIgnoreCase("start")) {
					System.out.println("sending...");
					file = new File("test.txt");
					dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
					
				} else if (str.equalsIgnoreCase("end")) {
					System.out.println("end");
					break;
				} else if (file != null) {
					System.out.println(str);
					dos.write(dp.getData(), 0, dp.getLength());
					
				} //end if
				
			} //end while
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}			

		}

	}

}

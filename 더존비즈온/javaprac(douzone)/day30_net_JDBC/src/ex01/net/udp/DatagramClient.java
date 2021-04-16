package ex01.net.udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {

	

	public DatagramClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds= null;
		DatagramPacket dp =null;
		DataInputStream dis = null;
		BufferedReader br = null;
		int port = 5000;
		String str;
		File file = null;
		byte b[];
		
		
		try {
			System.out.println("UDP  file client.");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("fileName?: ");
			String fileName= br.readLine();
			System.out.println("ip address?: ");
			String ipAddress = br.readLine();
			
			
			
			
			
			file=  new File(fileName);
			if(file.exists() ==false) {
				System.out.println("there is no file.");
				System.exit(0);
				
			}
			ds=  new DatagramSocket();
			InetAddress ip = InetAddress.getByName(ipAddress);
			str = "start";
			b = new byte[65536];
			
			dp= new DatagramPacket(b, b.length,ip,port);
			ds.send(dp); //sned
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			while (true) {
				int count = dis.read(b, 0, b.length);
				if(count==-1) {
					break;
				}
				dp = new DatagramPacket(b, count, ip,port);
				ds.send(dp);
			}
			str=  "end";
			b = str.getBytes();
			dp = new DatagramPacket(b, b.length, ip, port);
			ds.send(dp);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				dis.close();
				ds.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		

	}

}

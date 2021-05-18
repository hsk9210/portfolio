package ex05.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {

	public TcpMultiChatClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args[0] = "kingsmile1";
		if(args.length != 1) {
			System.out.println("no client instance nickname.");
			System.exit(0);
		}
		
		try {
			
			
			
			//Thread receiver=  new Thread(new ClientReceiver(s));
			
			//send.start();
			//receiver.start();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	class ClientReceiver extends Thread{
		Socket s;
		DataInputStream dis;
		public ClientReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//super.run();
			while (dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
	}
	
	class ClientSender extends Thread{
		Socket s;
		DataOutputStream dos;
		String name;
		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;	
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//super.run();
			Scanner sc = new Scanner(System.in);
			try {
				if(dos !=null) {
					dos.writeUTF(name);
					while (dos!=null) {
						dos.writeUTF(name+" "+sc.nextLine());
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}

//package ex05.net.chat;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Iterator;
//
//import javafx.application.Platform;
//
//public class TcpMultiChatServer {
//
//	public TcpMultiChatServer() {
//		// TODO Auto-generated constructor stub
//		
//		HashMap clients = new HashMap();
//		Collections.synchronizedMap(clients);
//		
//		Socket s;
//		ServerSocket ss;
//		
//		try {
//			ss =new ServerSocket(8000);
//			System.out.println("server start");
//			while (true) {
//				s =ss.accept();
//				System.out.println(s.getInetAddress() +" "+ s.getPort());
//				ServerReceiver thread = new ServerReceiver(s); //user class
//				thread.start(); //run() 대기 상태로 유도
//			
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	class ServerReceiver extends Thread{ //inner class
//		Socket s;
//		DataInputStream dis;
//		DataOutputStream dos;
//		String name ="";
//		public ServerReceiver(Socket s) {
//			this.s = s;
//			try {
//				dis = new DataInputStream(s.getInputStream());
//				dos = new DataOutputStream(s.getOutputStream());
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("receive failure.");
//			}
//		}
//		
//		
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			try {
//				name = dis.readUTF();
//				sendToAll("#"+name+" entered.");
//				//clients.put(name,dos); //input in hashmap
//				//System.out.println("now server people is..."+clients.size());
//				
//				while(dis != null) {
//					sendToAll(dis.readUTF());
//				}
//				
//				
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			} finally {
//				sendToAll("#"+name+" is out.");
//				//clients.remove(name);
//				System.out.println("out: "+s.getInetAddress()+" "+s.getPort());
//				//System.out.println(clients.size());
//			}
//		}
//		public void sendToAll(String string) {
//			// TODO Auto-generated method stub
//			//Iterator it = clients.keySet().iterator();
//			
//			
//			while (it.hasNext()) {
//				try {
//					//DataOutputStream dos = (DataOutputStream)clients.get(it.next());
//					dos.writeUTF(string);
//													
//				} catch (Exception e) {
//					e.printStackTrace();
//					// TODO: handle exception
//				}
//				
//				Client client = iterator.next();
//				client.socket.close();
//				iterator.remove();
//				
//				//ServerExample.Client client = (ServerExample.Client) iterator.next();
//							
//			}
//			if(serverSocket !=null && !executorService.isShutdown()) {
//				serverSocket.close();
//			}
//			if(executorService != null && !executorService.isShutdown()) {
//				executorService.shutdown();
//			}
//			Platform.runLater(()->{
//				//나중에 awt나 javaFX 메세지 띄우는 메소드 하나 추가 필요.
//				//System.out.println("server start");
//				displayText("server stop");
//				btnStartStop.setText("start");
//			});
//			
//		}
//		
//		
//		
//	}
//	
//	
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new TcpMultiChatServer();
//
//	}
//
//}

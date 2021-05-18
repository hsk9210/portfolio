package ex03.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

//server - 2sockets
public class ServerTime {

	public ServerTime() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int port = 7000 ; //0~1024 is reserved
		
		try {
			System.out.println("server start.");
			ServerSocket sSocket = new ServerSocket(port);
			while (true) {
				Socket socket = sSocket.accept();
				OutputStream os =socket.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());
				oos.flush();
				sSocket.close();
				socket.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}

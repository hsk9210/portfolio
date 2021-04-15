package ex03.net.tcp;

import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

//client - 1 socket
public class ClientTime {

	public ClientTime() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String serverIP = "192.168.20.26"; //127.0.0.1
		int port = 7000;
		Date date=  null;
		
		try {
			Socket clientSoc = new Socket(serverIP, port);
			InputStream is = clientSoc.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("get Date from teacher server. this is clientSocket.");
			date = (Date)ois.readObject();
			System.out.println("server Date: "+date);
			
			InetAddress serverInfo = InetAddress.getByName(serverIP); //or getByAddress
			System.out.println(serverInfo.getHostAddress()+" "+serverInfo.getHostName());
			
			clientSoc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}

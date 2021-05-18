package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerMsg {

	public ServerMsg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int port = 7000 ; //0~1024 is reserved
		



		try {

				System.out.println("server start");
				ServerSocket sSocket = null;//= new ServerSocket(port);
				Socket socket =null; //= sSocket.accept();

				OutputStream os =socket.getOutputStream(); //write
				ObjectOutputStream oos = new ObjectOutputStream(os);
						
				
				
				
				InputStream is = socket.getInputStream(); //read
				
				
				
				
				byte arr[] = new byte[100];
				is.read(arr);
								

				
				String arg0 = "hel";
				os.write(arg0.getBytes());
				
				oos.writeObject(new Date());
							
				oos.flush();
				os.flush();
				
				sSocket.close();
				socket.close();
				


			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {


			
		}
		
		
		

	}

}

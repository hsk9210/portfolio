package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientMsg {

	public ClientMsg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//io
		try {
			Socket s = null;
			InputStream is=  s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			String str= "hel";
			os.write(str.getBytes());
			byte arr[] = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			String msg = "client";
			os.write(msg.getBytes());
			os.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//try {s.close()}
		}
		
		

	}

}

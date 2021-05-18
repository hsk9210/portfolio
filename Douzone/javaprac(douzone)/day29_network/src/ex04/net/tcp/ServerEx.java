package ex04.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public ServerEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br=null,stin=null;
		BufferedWriter bw=null;
		ServerSocket server = null;
		Socket client = null;
		
		System.out.println("i am server");
		try {

			
			server = new ServerSocket(9999);
			client=  server.accept();
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//from keyboard inputstream
			stin = new BufferedReader(new InputStreamReader(System.in));
			//outputstream from client
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMsg;
			while (true) {
				inputMsg = br.readLine(); //read 1 line from client
				//if client input "exit", then  exit
				if(inputMsg.equalsIgnoreCase("exit")) {
					break;
				}
				//console output from client input msg
				System.out.println(inputMsg);
				//read one line from keyboard
				String outputMsg = stin.readLine();
				//submit to server
				bw.write("from  192.168.20.12: "+outputMsg+"\n");
				bw.flush();
			} //end while
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			
			try {
				client.close();
				server.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		

	}

}

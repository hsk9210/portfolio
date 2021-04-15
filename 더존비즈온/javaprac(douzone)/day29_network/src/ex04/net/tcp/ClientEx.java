package ex04.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {

	public ClientEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null, stin=null;
		BufferedWriter bw=null;
		Socket client = null;;
		
		System.out.println("i am client.");
		try {
			client = new Socket("192.168.20.26", 9999);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//from keyboard inputstream
			stin = new BufferedReader(new InputStreamReader(System.in));
			//outputstream from client
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMsg;
			
			while (true) {
				outputMsg = stin.readLine(); //read 1 line from client
				//if client input "exit", then  exit
				if(outputMsg.equalsIgnoreCase("exit")) {
					//submit to server
					bw.write("from  192.168.20.12: "+outputMsg+"\n");
					bw.flush();
					break;
				}
				//console output from client input msg
				System.out.println(outputMsg);
				//read one line from keyboard
				String inputMsg = stin.readLine();
				//submit to server
				bw.write("from  192.168.20.12: "+outputMsg+"\n");
				bw.flush();
			} //end while
	
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				client.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		

	}

}

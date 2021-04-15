package ex04.net.tcp;
import java.net.*;
import java.io.*;

public class ClientEx2 {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		Socket client = null;
		
		try {
			client = new Socket("localhost", 9999);   // 127.0.0.1  or 192.168.20.26
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			while(true) {
				System.out.println("message input : ");
				outputMessage = stin.readLine();
				
				if( outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				} // end if
				
				//Ű����κ��� ���� ���ڿ� ����
				bw.write("Client > " + outputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			} // end while
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {	client.close(); } 
			catch (IOException e) {	System.out.println("Server �� ä�� �� ���� �߻�.....");	}
		}
	}
}    






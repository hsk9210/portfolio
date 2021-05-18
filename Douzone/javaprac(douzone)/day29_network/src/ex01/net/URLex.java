package ex01.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLex {

	public URLex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL google = new URL("https://www.google.com");
		BufferedReader br= new BufferedReader(new InputStreamReader(google.openStream()));
		
		
		//이 코드가 내 개선 버전.
		String htmlText;
		String result="";
		while( ( htmlText=br.readLine() ) != null) {
			//htmlText+=br.readLine();
			result+=htmlText+" \n";
		}
		System.out.println(result);
		//System.out.println(google.getAuthority()+" "+google.getDefaultPort()+" "+google.getFile()+" "+google.getHost()+" "+google.getProtocol());
		
		///////////////////////////////////////
		//이런 3항 타입 조건문 공부하기.
//		String inputLine;
//		while ( (inputLine = br.readLine()) != null) {
//			System.out.println(inputLine);			
//			
//		}
		
		

	}

}

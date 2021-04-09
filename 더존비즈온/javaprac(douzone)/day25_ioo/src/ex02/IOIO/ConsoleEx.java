package ex02.IOIO;

import java.io.Console;

public class ConsoleEx {

	public ConsoleEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바 6 이후로 콘솔에서 입력받은 문자열을 쉽게 다루는
		 * java.io.Console 클래스를 제공한다.
		 * 이거는 이클립스에서 System.console() 메소드는 null을 리턴하니
		 * 반드시 명령 프롬프트에서 실행해야 한다.
		 */
		Console console = System.console();
		System.out.println("id");
		String idd=  console.readLine();
		System.out.println("pw");
		char ps[] = console.readPassword();
		String strPw = new String(ps); //char[] 배열을 문자열 객체로 생성.
		
		System.out.println(idd+" "+strPw);

	}

}

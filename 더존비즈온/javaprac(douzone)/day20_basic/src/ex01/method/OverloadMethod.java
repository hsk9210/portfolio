package ex01.method;

public class OverloadMethod {

	public OverloadMethod() {
		// TODO Auto-generated constructor stub
	}
	public static void line() {
		System.out.println("void");		
	}
	public static void line(int n) {
		System.out.println(""+n+n+n+n+n+n+n+n+n+n+n);
		
	}
	public static void line(String n) {
		System.out.println(n+n+n+n+n+n+n+n+n+n+n);		
	}
	public static String line(String str, int n) {
		
		return "";
	}
	public static void main(String args[]) {
		line(1);
		line("nnn");
		line();
	}

}

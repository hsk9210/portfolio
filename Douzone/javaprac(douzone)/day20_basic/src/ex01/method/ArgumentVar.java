package ex01.method;

public class ArgumentVar {

	public ArgumentVar() {
		// TODO Auto-generated constructor stub
	}
	public static void plus(int...x) {
		int sum = 0;
		for(int a:x) {
			System.out.print(a+" ");
		}
	}
	public static void plus(String...x) {
		int sum = 0;
		for(String a:x) {
			System.out.print(a+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plus(1,2,3,4,5,6);
		plus("a","b");

	}

}

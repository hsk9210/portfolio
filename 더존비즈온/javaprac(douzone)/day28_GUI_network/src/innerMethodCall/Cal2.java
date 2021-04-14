package innerMethodCall;

import java.util.Scanner;

public class Cal2 {

	public Cal2() {
		// TODO Auto-generated constructor stub
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	double avg(int x, int y) {
		double sum = plus(x, y);
		return sum/2;
	}
	void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x와 y 입력: ");
		double result = avg(sc.nextInt(), sc.nextInt());
		println("실행결과: "+result); //private void println() 하단의 메소드를 사용하는 것이다!!!
		sc.close();
	}
	private void println(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
		
	}
	

}

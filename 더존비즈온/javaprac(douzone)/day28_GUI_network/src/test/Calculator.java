package test;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	void on() {
		System.out.println("power on");
	}
	int plus(int x, int y) {
		return x*y;
	}
	double divide(int x, int y) {
		return (double)x / (double)y;
	}
	void off() {
		System.out.println("power off");
	}
	int sum(int values[]) {
		int result = 0;
		for(int i=0;i<values.length;i++) {
			result+=values[i];
		}
		return result;
	}
	int sum2(int...values) {
		int result = 0;
		for(int i=0;i<values.length;i++) {
			result+=values[i];
		}
		return result;
	}
	int plus2(byte x, byte y) {
		int result = x+y;
		return result;
	}
	

}

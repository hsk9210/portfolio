package ex05.Abstract;

public abstract class Shape {
	double result = 10;
	//추상메소드 2개.
	public abstract double calc(double x, double y);
	public abstract void show(String name);
	
	public void view() {
		//일반메소드
		System.out.println("super class shape 입니다.");
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double calc(double x) {
		// TODO Auto-generated method stub
		return 0;
	}


}

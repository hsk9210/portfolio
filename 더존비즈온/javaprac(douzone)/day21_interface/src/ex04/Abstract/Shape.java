package ex04.Abstract;

public abstract class Shape {
	public double result = 10;
	//추상메소드 2개.
	public abstract double calc();
	public abstract double calc(double x);
	public abstract double calc(double x, double y);
	public abstract void show(String name);
	
	public void view() {
		//일반메소드
		System.out.println("super class shape 입니다.");
	}


}

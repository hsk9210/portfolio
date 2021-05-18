package ex01.oop;

public class Point extends Object{
	private int x,y,r; //멤버변수, 접근지정자 default

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void display() {
		System.out.println(x + ", "+ y);
	}
		
}
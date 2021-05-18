package ex02.inheritance;

public class Rectangle1 {
	private double x,y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	
	public String display() {
		return "Rectangle [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setY(double y) {
		this.y = y;
	}

	public Rectangle1() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle1(double x) {
		this.x = x;
		y = 10;
		
	}
	public Rectangle1(double x, double y) {
		this.x = x;
		this.y = y;		
	}
	public double returnRect(double x, double y) {
		return x*y;
	}

}

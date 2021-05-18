package ex03.abstract1;

public class Rectangle1 extends Point {
	double x,y,r;


	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Rectangle1(double r) {
		// TODO Auto-generated constructor stub
		super(r);
		this.r = r;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}

}

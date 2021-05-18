package ex03.abstract1;

public abstract class Point {
	protected double x,y;

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

	public Point(double r) {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String display();

}


package ex03.abstract1;

public class Circle extends Point {
	public Circle(double r) {
		super(r);
		// TODO Auto-generated constructor stub
	}


	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}


	@Override
	public String display() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + ", getR()=" + getR() + ", getX()=" + getX() + ", getY()="
				+ getY() + ", display()=" + display() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

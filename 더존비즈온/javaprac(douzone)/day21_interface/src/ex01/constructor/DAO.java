package ex01.constructor;

public class DAO {

	private int x,y;
	
	public DAO() {
		this(10,100);
	}

	public DAO(int i, int j) {
		// TODO Auto-generated constructor stub
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void display() {
		System.out.println(x+","+y);
	}

	@Override
	public String toString() {
		return "DAO [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



}

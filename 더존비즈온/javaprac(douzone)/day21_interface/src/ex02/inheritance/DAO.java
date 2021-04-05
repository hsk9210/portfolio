package ex02.inheritance;

public class DAO {

	private int x,y;

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
	public DAO(int x) {
		//this.x = x;
		//this.y = 111111;
		this(x,1111111);
	}
	public DAO() {
		
	}

	public DAO(int x, int y) { //생성자에 매개변수 받아서.
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y=  y;
	}


}

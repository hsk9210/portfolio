package ex08.API;

class Rectangle{
	int x,y;
	public void disp() {
		System.out.println("x*y: "+x*y);
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
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
	
}


public class ToStringMain {

	public ToStringMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r= new Rectangle();
		r.setX(4); r.setY(5);
		r.disp();
		System.out.println(r.toString());
		

	}

}

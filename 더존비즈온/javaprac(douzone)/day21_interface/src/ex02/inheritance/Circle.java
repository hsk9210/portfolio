package ex02.inheritance;

public class Circle extends DAO {
	
	private double r = Math.PI;
	
	public Circle() {
		r = Math.PI;
	}
	
	public Circle(int x, int y) {
		super(x, y); //부모의 생성자함수를 지칭한다.
		this.r = r;
		// TODO Auto-generated constructor stub
		/*
		 * 
		 */
	}


	public void disp() {
		System.out.println(getX()+", "+getY());
	}


	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}

}

package ex02.inheritance;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(3, 5); //객체생성, 메모리할당, 생성자함수 자동호출
		c.disp();
		
		Rectangle1 rect = new Rectangle1(10,20);
		double x = rect.getX();
		double y = rect.getY();
		System.out.println(x*y);
		System.out.println(rect.display());
		System.out.println(rect.returnRect(x, y));

	}

}

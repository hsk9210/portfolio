package ex03.abstract1;

public class MainEntry {
	/**
	 * 추상 메소드를 상속받은 경우
	 * 자체적으로 객체를 생성하거나
	 * 
	 */

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle c = new Circle();
		Point pt = new Rectangle1(0);
		pt.setX(4);
		pt.setY(5);
		pt.display();
		pt = new Circle(1);
		pt.display();
//		c.setX(3);
//		c.setY(5);
//		System.out.println(c.display());
//		System.out.println(c.display());
		
	}

}

package ex01.oop;


public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setR(3); c.setX(3);c.setY(6);
		System.out.println(c.getR()+", "+c.getX()+" "+c.getY());
		
		Rectangle rec = new Rectangle();
		rec.setX(5);
		rec.setY(4);
		rec.display();
		
		
		
//		Point poi = new Point(); //레퍼런스 변수. 실제 데이터가 들어간 곳의 주소를 참조하는 변수.
//		System.out.println(poi.getX()+", "+poi.getY());
//		poi.setX(99);
//		poi.setY(34);
//		poi.display();
//		poi.setX(0);
//		poi.display();
//		System.out.println(poi.hashCode());
//		
//		Point pt2 = new Point();
//		poi.setY(99);
//		poi.display();
//		System.out.println(pt2.hashCode());
		

	}

}


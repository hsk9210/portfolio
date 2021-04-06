package ex08.API;

class Point {
	
}

public class ObjectClass {

	public ObjectClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(0x15db9742);
		
		Point p2 = new Point();
		System.out.println(p2.getClass());
		System.out.println(p2.hashCode());
		System.out.println(p2.toString());
		System.out.println(p2);
		System.out.println();
		
		System.out.println(p2.getClass().getName()+" "+ Integer.toHexString(p2.hashCode()));
		
		Point p3 =new Point();
		if(p.hashCode() == p3.hashCode()) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		//
		//
		Point p4;
		p4 = p;
		if(p.hashCode() == p4.hashCode()) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		
		
	}

}

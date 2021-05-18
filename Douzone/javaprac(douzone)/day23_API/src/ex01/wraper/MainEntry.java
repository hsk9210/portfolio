package ex01.wraper;

class Point {
	
}

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ia = new Integer(11);
		Integer ib = new Integer("10");
		System.out.println(ia);
		System.out.println(ib);
		String su = "30";
		int num = Integer.parseInt(su);
		System.out.println(num);
		Point p = new Point();
		
		System.out.println(p); //address
		System.out.println(p.toString()); //address
		System.out.println(ia);
		System.out.println(Integer.toHexString(ia.hashCode()));
		int x = 77;
		double y = 5.5;
		System.out.println(x+y);
		x = (int) y;
		System.out.println(x);
		
		//boxing vs unboxing
		int c = ia.intValue(); // In jdk 4.0 lower
		int d = ib; // jdk 5.0 upper, Auto-boxing,unboxing supported.
		System.out.println(ia.MAX_VALUE);
		System.out.println(ia.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Double ddd = 12.34;
		Double dd = new Double(12.34);
		
		//class 이므로 비교하려면 equals method use.
		if(ddd.equals(dd)) {
			System.out.println("same");
		}
		c  =(int)dd.doubleValue();
		System.out.println(c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111111111111111111111111111", 2);
		if(f==ia.MAX_VALUE) {
			System.out.println("same");
		}
		//System.out.println(f);
		int xx = 3; //stack
		Integer yy = new Integer(3); //heap
		xx = yy;
		//xx = yy.intValue();
		
		System.out.println(xx);
		
		
		
		
		
		
		

	}

}

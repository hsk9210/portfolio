package ex08.API;

class Circle{
	
}

public class EqualsMain {

	public EqualsMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		if(c1 == c2) {
			System.out.println("same");
			
		} else {
			System.out.println("diff");
		}
		int x=3,y=3;
		if(x==y) {
			System.out.println("same");
			
		}else {
			System.out.println("diff");
		}
		System.out.println("-------");
		String str1 = new String("kor");
		String str2 = new String("kor");
		if(str1.equals(str2)) {
			System.out.println("same?");
		} else {
			System.out.println("no, diff.");
		}
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}

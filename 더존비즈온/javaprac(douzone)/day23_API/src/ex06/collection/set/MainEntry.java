package ex06.collection.set;

//instanceOf
class A{
	
}
class B extends A{
	
}



public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A);
		System.out.println(b instanceof A);
		System.out.println(a instanceof B);
		

	}

}

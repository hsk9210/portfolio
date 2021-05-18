package ex02.Interface;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//1. self object creation
		BB b = new BB();
		b.draw();
		System.out.println(b.su);
		//2. make Object from super interface
		IDraw bb = new BB();
		bb.draw();
		System.out.println(bb.su);
		
		
	}

}

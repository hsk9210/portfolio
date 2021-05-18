package ex01.Interface;

interface A { // interface - abstract method, static final field only.
	//
	int x = 90;
	static final int y = 80;
	String str1 = "A";
	//abstract method.
	public void show(); //== public abstract void show()
	public abstract void disp();
}
interface B {
	void view();
}
interface C {
	String name = "doyeon";
	public void draw();
}

/*
 * interface 'extends' interface
 */
interface D extends B {
	void dView();
}

class Shape{
	
}
class MultiClass extends Shape implements B,C,A{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}
	
}
class Point implements A{
	
	@Override
	public void show() {
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
}
class Circle implements C{
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(name+ " nim");
		
	}
	
}





public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		//c.name = "ddd";
		c.draw();
		C cc = new Circle();
		cc.draw();
		
		A a = new Point();
		a.show();
		D d = new Rect();
		d.dView();
		//d.plus();
		Rect dd = new Rect();
		System.out.println(dd.plus(3, 5));

	}

}

package ex03.multiImplements;

import ex02.Interface.IDraw;
import ex05.Abstract.Shape;

public class MultiClass extends Shape implements Test, IDraw {

	public MultiClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("IDraw interface");

	}
	public void draw(String m) {
		// TODO Auto-generated method stub
		System.out.println(m+" interface");
	}

	

	@Override
	public void testView() {
		// TODO Auto-generated method stub
		System.out.println("Test interface");

	}

	@Override
	public double calc(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println("Shape abstract class");
		return x*y;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		System.out.println("from abstract shape class, "+name);
	}

}

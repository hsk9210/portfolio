package ex04.Abstract;

import ex05.Abstract.Shape;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r = new Rectangle();
		r.calc(3, 5);
		r.draw();

	}

}

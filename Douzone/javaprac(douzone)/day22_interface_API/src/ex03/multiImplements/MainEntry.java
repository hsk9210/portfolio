package ex03.multiImplements;

import ex05.Abstract.Shape;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new MultiClass();
		s.show("도형임");
		s.view();
		System.out.println("----------");
		Test t = new MultiClass();
		t.testView();
		System.out.println(t.str);
		System.out.println("----------");
		MultiClass multi = new MultiClass();
		multi.draw("multi");
		
		
	}

}

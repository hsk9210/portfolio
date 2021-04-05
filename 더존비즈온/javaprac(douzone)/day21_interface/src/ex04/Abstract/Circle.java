package ex04.Abstract;

import ex05.Abstract.Shape;

public class Circle extends Shape {
	double r = 2.0;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		result = r*r*Math.PI;
		return Math.round(result) ;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원의 넓이: "+result+" 입니다.");
		
	}

}

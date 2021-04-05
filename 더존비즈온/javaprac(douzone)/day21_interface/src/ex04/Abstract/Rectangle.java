package ex04.Abstract;

import ex05.Abstract.Shape;

public class Rectangle extends Shape {
	double x=0,y=0;
	double result = 0;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double draw() {
		// TODO Auto-generated method stub
		System.out.println("원의 넓이: "+result+" 입니다.");
		return result;

	}

	@Override
	public void calc(double x, double y) {
		// TODO Auto-generated method stub
		result =  Math.round(x*y);
	}

}

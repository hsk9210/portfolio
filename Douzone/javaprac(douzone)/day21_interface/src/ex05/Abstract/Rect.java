package ex05.Abstract;


public class Rect extends Shape {
	int h = 10;

	@Override
	public double calc() {

		return h*result;

	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		//calc();
		System.out.println(calc()+" 크기의 "+name+" 이 그려졌습니다.");

	}

	@Override
	public double calc(double x, double y) {
		return x*y;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		return x*h;
	}

}

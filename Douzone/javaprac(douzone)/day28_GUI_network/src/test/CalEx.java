package test;

public class CalEx {

	public CalEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.on();
		
		int result1 = cal.plus(3, 4);
		System.out.println("result1: "+result1);
		
		byte x= 10;
		byte y=4;
		double result2 = cal.divide(x, y);
		System.out.println("result2: "+result2);
		int b[] = {1,2,3,4,5};
		int a= cal.sum(b);
		System.out.println("sum[1,2,3,4,5]: "+a);
		int sumOfArr = cal.sum(new int[]{1,2,3,4,5,6});
		System.out.println("sum2: "+sumOfArr);
		int sumOfArr2 = cal.sum2(4,5,6);
		
		cal.off();

	}

}

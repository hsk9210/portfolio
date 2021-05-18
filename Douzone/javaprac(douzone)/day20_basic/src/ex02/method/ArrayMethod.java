package ex02.method;

public class ArrayMethod {

	public ArrayMethod() {
		// TODO Auto-generated constructor stub
	}
	public static int methodTest(int x, int y) {
		return x+y;
	}
	public static double methodTest(double x, double y) {
		return x+y;
	}
	public static int[] arrayMethod(int a) {
		int arr[] = new int[1];
		arr[0] = a;
		return arr;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(methodTest(3, 4));
		System.out.println( arrayMethod(3)[0] );
		double result = methodTest(1.2, 5.5);
		System.out.println(result);
		String aaa = "asdf";
		System.out.println(aaa.equals("asdf"));
		
		while(true) {
			double bbb = Math.random()*10;
			System.out.println(bbb);
			if(bbb>7) {
				break;				
			}
			
		}
		
	}

}

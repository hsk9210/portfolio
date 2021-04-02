package quiz;

public class Quiz_method {

	public Quiz_method() {
		// TODO Auto-generated constructor stub
	}
	//return type: void
	public static void plus(int x, int y) {
		System.out.println(x+y);
	}
	public static void minus(int x, int y) {
		System.out.println(x-y);
	}
	// return type: int
	public static int multi(int x, int y) {
		return x*y;
	}
		
	public static int div(int x[]) { //param type: array
		return x[0]/x[1];
	}
	public static void name1() { // param type : void
		System.out.println("input, output:none");		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사칙연산 함수 + - , 리턴타입 없는 형태 * / , 리턴 타입 있는 형태
		plus(3,5);
		minus(5,3);
		System.out.println(multi(3, 5));
		try {
			int y[] = {6,0};
			System.out.println(div(y)); // 매개변수나 반환타입은 이렇게 다른 방법도 가능한듯.			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		name1();
			

	}

}

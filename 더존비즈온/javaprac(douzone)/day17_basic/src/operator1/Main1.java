package operator1;

public class Main1 {
	//연산자 :  높은<-  최단산쉬관논삼대콤      ->낮은
	public Main1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단항연산자 증감  <-
		
		int x = 10,y;
		int num1 = 5;
		int num2 = 13;
		boolean led = true;
		
		/**
		 * 증감 연산자
		 * 변수에 지정된 값을 1씩 증가시키거나 감소시키는데...
		 * 피연산자의 앞이나 뒤에 위치하는지에 따라 증감 연산의 순서와
		 * 결과가 달라진다.
		 * 
		 * 전위형prefix
		 * 연산기호가 피연산자의 앞에 붙는다.
		 * ++num   연산 방향이 <- 이니 선 1증가 후 연산
		 * 
		 * 
		 * */
		System.out.println("~x: "+~x); //비트 부정: -(origin+1) 즉 1의 보수
		y = x++;//후위연산, 대입먼저, 연산은 나중에.
		y = x;
		y = ++x;
		System.out.println("x: "+x);
		System.out.println("y :" +y);
		System.out.println("y :" +y);
		System.out.println("!led: "+!led);
		System.out.println("!(num1>num2): "+ !(num1>num2));
		System.out.println("7/3 :"+(7/3));
		

	}

}

package shift;
import javax.script.*;

public class OperatorTest {

	public OperatorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String str1 = "JAVA";
		String str2 = "Program";
		System.out.println(str1==str2);
		System.out.println(str1 != str2);

		int f = 4;
		int s = 7;
		
		System.out.println(f&s); //4
		System.out.println(f|s); //7
		System.out.println(f^s);//3
		System.out.println();
		System.out.println(f>s &&f<s); //f
		System.out.println(f>s ||f<s); //t
		System.out.println(f>s ^ f<s); //t
		System.out.println( !(f>s) && f<s ); //t
		int x=20,y=20;
		if(x != y) {
			System.out.println("false");
		}
		else if(x==y) {
			System.out.println("true1");			
		}
		else {
			System.out.println("other");
		}
		int a = x>y ? 10 : 20; //x>y가 false이면 a=20
		System.out.println(a+"\n");
		int num1 = 30;
		// 30 + ((30+1) + 1) 상황 만들기.
		System.out.println(num1++ + ++num1); //30 + 32 가 되는군.
		
		

	}

}

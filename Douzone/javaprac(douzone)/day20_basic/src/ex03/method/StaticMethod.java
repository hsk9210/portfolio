package ex03.method;

class B{
	int x,y	;
	
	public static void aaa(int x, int y) {
		x = x;
		y = y;
		System.out.println(x+" "+ y);
		
	}
}

public class StaticMethod {

	public StaticMethod() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		b.x = 9;
		b.aaa(0, 0);
		System.out.println(b.x);
		B.aaa(1,1);
		
		int q=0, w=0;
		
		for(int i=0;i<100;i++) {
			if(i==30) {
				break;
			}
			System.out.println(i);
		}
		

	}

}

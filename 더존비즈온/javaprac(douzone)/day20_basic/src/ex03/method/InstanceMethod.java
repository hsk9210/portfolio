package ex03.method;

/*
 * instance method: 객체 생성하고 사용해야함(메모리에 할당이 되어야 한다.)
 * 
 */
class A{
	int x,y;
	
	public void setData(int x,int y) {
		x =x;
		y = y;
		System.out.println(x+", "+y);		
	}
	
}




public class InstanceMethod {



//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		A a= new A(); //객체생성, 메모리에 할당, 생성자함수 자동 호출
//		a.setData(20, 50);
//		
//		InstanceMethod im = new InstanceMethod();
//		im.showName();
//
//	}
//
//	private void showName() {
//		// TODO Auto-generated method stub
//		System.out.println("hans");
//		
//	}

}

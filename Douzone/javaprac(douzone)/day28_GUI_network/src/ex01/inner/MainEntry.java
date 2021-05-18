package ex01.inner;

class OuterClass{
	static int no;
	String msg = "hi~";
	
	public void outerMethod() {
		System.out.println("outer method call.");
		//System.out.println(su); //outer 에서는 inner class 멤버변수 접근 불가
	}
	
	class InnerClass{
		int su = 999;
		public void show() {
			System.out.println(su);
			System.out.println(msg); //outer 클래스의 멤버 접근 가능
		}
		public void disp() {
			outerMethod();
		}
	}
}


public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		OuterClass oc=  new OuterClass();
		OuterClass.InnerClass inner  =oc.new InnerClass();
		inner.disp(); inner.show();
		System.out.println("00000000000");
		//2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
		
		

	}

}

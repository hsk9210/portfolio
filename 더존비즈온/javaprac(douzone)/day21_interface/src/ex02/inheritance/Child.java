package ex02.inheritance;

public class Child extends Parent{
	
	String model;
	int num = 100;
	void showData() {
		System.out.println("조상클래스 변수 num= "+ super.num);
		System.out.println("자식클래스 인스턴스변수 num= "+ num);
	}
	
	void game() {
		super.call(); //상위클래스의 call() 호출
		System.out.println("and "+model+" game gogo");
		
	}

	public Child() {
		// TODO Auto-generated constructor stub
	}

}

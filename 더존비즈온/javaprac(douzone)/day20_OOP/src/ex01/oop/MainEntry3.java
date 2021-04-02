package ex01.oop;

public class MainEntry3 {

	public MainEntry3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV samsungTV = new TV(); //삼성 tv 기반의 객체를 만든다.
		
		samsungTV._changeChannel(5); //5번으로 채널을 변경하고,
		samsungTV.display(); //바뀌었는지 확인하라.
		
		samsungTV._changeColor("Red"); // 티비의 색상을 바꾸고,
		System.out.println(samsungTV._colorIs()); //색상의 상태를 본다.
		
		samsungTV.display(); //현재까지의 상태.
		

	}

}

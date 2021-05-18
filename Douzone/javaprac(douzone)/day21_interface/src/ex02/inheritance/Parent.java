package ex02.inheritance;

public class Parent {
	/*
	 * 조상 클래스와 자손 클래스에 같은 이름의 변수나 메소드가 존재한다면,
	 * 멤버들의 구분은 super 키워드를 통해서 구분한다.
	 * 여기서의 super 키워드는 상위클래스를 지정하는 용도로 사용된다.
	 */
	/*
	 * 메소드 호출
	 * 하위클래스에서 상위 클래스ㅢ 메소드를 호출할 때에도 super 키워드를 이용해서 호출
	 * 
	 */
	
	
	String phoneNumber;
	int num = 0;
	
	void call() {
		System.out.println(phoneNumber+"에서 통화.");
	}

	public Parent() {
		// TODO Auto-generated constructor stub
	}

}

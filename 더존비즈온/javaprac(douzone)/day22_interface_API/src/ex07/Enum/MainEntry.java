package ex07.Enum;

/*
 * enum 열거형: 새로운 클래스 타입을 정의하는 것
 * 특정한 값만을 가질 수 있는 데이터 타입을 정의할 때 ㅠㅣㄹ요하다.
 * 형식: 
 * access modifier 
 */
enum UserStatus{
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETE ;
}



public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//1. 즉시 call var
		System.out.println(UserStatus.DELETE);
		for(UserStatus s: UserStatus.values()) {
			System.out.println(s);
		}
	}

}

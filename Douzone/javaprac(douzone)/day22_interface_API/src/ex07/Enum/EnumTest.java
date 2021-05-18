package ex07.Enum;

enum Day{
	mon,tue,wed,thu,fri,sat,sun;
}
/*
 * 실제로 상수가 몇가지 케이스로 정해진 경우,
 * switch case와 더불어 주로 사용된다.
 * 
 */

public class EnumTest {
	Day day;
	public EnumTest() {
		// TODO Auto-generated constructor stub
	}
	
	public EnumTest(Day day) {
		this.day = day;
	}
	public void tellitlikeitis() {
		switch (day) {
		case mon:
			System.out.println("mon");
			break;
		case tue:
			System.out.println("tue");
			break;
		case wed:
			System.out.println("wed");
			break;
		case thu:
			System.out.println("thu");
			break;
		case fri:
			System.out.println("fri");
			break;
		case sat:
			System.out.println("sat");
			break;
		default:
			System.out.println("sun");
			break;
		}
	}
	public static void main(String[] args) {
		EnumTest t  = new EnumTest();
		t.day=Day.mon;
		t.tellitlikeitis();
		
	}

	

}

package ex02.inheritance;

public class InheritanceTest {

	public InheritanceTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		
		ch.phoneNumber = "1111111";
		ch.model = "google";
		ch.call();
		ch.game();
		System.out.println(ch.toString());
		
		Child ch2 = new Child();
		ch2.showData();

	}

}

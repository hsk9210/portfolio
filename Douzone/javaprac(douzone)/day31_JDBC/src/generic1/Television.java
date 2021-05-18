package generic1;

public class Television {
	static String company = "samsung";
	static String model = "LCD";
	static String info;
	
	//instance field, method
	int field1;
	void aaa() {
		
	}
	
	
	static {
		info = company + "-"+model;
	}

	public Television() {
		// TODO Auto-generated constructor stub
	}
	static void method3() {
		Television tel = new Television();
		tel.field1 = 10;
		tel.aaa();
		System.out.println(tel.field1);
	}

}

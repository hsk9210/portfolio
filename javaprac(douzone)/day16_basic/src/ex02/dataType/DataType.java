package ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		String str1 = "A"; //문자열 2byte
		char ch = 'A'; //단일문자면 1byte...?
		
		System.out.println(str1);
		System.out.println(300L);
		System.out.println(3.547f);
		System.out.println((int)ch);
		int num = 0;
		int result = num % 3;
		
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+ " ");
		}
		System.out.println('\n');
		for(int i=65;i<='Z';i++) {
			System.out.print((char)i+ " ");
		}
		System.out.println('\n');
		String str2 = "jdk" + 60;
		String str3 = str2 +"   charistic";
		System.out.println(str3);
		//피연산자 중 문자열이 있으면 문자열로 결합됨.
		String str4 = "jsk" + 3 + 3.0; 
		String str5 = 3 + 3.0 + "jdk";
		System.out.println(str4);
		System.out.println(str5);
		float ff = (float) 678.6000;
		short sh = 3;
		int num2 = 50000;
		sh = (short) num2;
		System.out.println(sh);
		
	}

}

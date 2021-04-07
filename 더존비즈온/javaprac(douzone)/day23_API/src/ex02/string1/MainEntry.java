package ex02.string1;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		int x= 999;
		String str = "abc";
		System.out.println(str);
		char data1[]= {'a','b','c'};
		String zzz = new String(data1);
		String xxx = new String("ewewfewe");
		str = new String(data1);
		System.out.println(str);
		System.out.println(xxx);
		
		String msg = "1";
		msg = msg.concat("seo");
		System.out.println(msg);
		String str2 = "abc".substring(1,2); //시작값 포함. 끝값 미포함. b가 나옴.
		System.out.println(str2);
		
		//StringBuffer
		
		
		
	}

}

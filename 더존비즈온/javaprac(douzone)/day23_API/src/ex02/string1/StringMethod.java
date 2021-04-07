package ex02.string1;

public class StringMethod {

	public StringMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * stringBuffer thread-safe 변경가능하지만 multiple thread환경에서 안전한 클래스.
		 * 
		 * 
		 */
		String s4=  new String("000-0000-0000  ").trim();
		String s5[] = s4.split("-");
		int i=0;
		while(s5.length>i) {
			System.out.print(s5[i]+" ");
			i++;
		}
		System.out.println();
		String q1 = "ASdddAAAddd".toLowerCase();
		System.out.println(q1);
		
		char ch2[] = q1.toCharArray();
		for(i=0;i<ch2.length;i++) {
			System.out.print(ch2[i] + " ");
		}
		
	

	}

}

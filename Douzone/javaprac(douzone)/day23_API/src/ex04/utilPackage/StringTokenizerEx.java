package ex04.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public StringTokenizerEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer t1,t2;
		t1= new StringTokenizer("박전 노김/ㅇㅇ", "/");
		t2 = new StringTokenizer("사과=1이초코렛=3샴페인=1", "=", true);
		
		while(t1.hasMoreElements()) {
			//다음 토큰이 있다면...
			System.out.println(t1.nextElement());
		}
		for(int i=0;i<t2.countTokens();i++) {
			System.out.println(t2.nextElement());
		}
		while(t2.hasMoreElements()) {
			String s = t2.nextToken();
			
			if(s.equals("=")) {
				System.out.print("\t");
			} else {
				System.out.println(s);
			}
		}

	}

}

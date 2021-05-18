package ex03.StringBuffer;

public class StringBufferEx01 {

	public StringBufferEx01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		StringBuffer sbf = new StringBuffer();
		System.out.println(sbf.hashCode());
		sbf.append("test stringBuffer12311111111111");
		System.out.println(sbf.hashCode());
		System.out.println("length: "+sbf.length());
		System.out.println("capacity: "+sbf.capacity());
		sbf.append(999999999);
		System.out.println(sbf.hashCode());
		System.out.println("length: "+sbf.length());
		System.out.println("capacity: "+sbf.capacity());
		sbf.trimToSize(); //용량과 크기 조절
		System.out.println(sbf.hashCode());
		System.out.println("length: "+sbf.length());
		System.out.println("capacity: "+sbf.capacity());
		

		
		String s3 = new String("   d     f     a");
		System.out.println(s3.length());
		s3 = s3.trim()	;
		System.out.println(s3);
		s3 = s3.replace(" ", "");
		System.out.println(s3);
		sbf = sbf.replace(0, 10, "");
		System.out.println(sbf);
		
		
		
		
		

	}

}

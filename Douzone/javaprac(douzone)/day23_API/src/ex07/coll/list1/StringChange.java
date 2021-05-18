package ex07.coll.list1;

import java.util.Scanner;

public class StringChange {

	public StringChange() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * subString을 이용하는 방법은 코드 길이에서 보듯이 비효율적으로 증명됨.
	 * 
	 *	 */
	void sum(String s, String...str) {
        for(String a:str)
            System.out.print(a+s);
    }
    void sum(String...str) {
        for(String a:str)
            System.out.print(a);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str;
		String upperResult = "",lowerResult="";
		String result="";
		//StringBuffer를 사용시,
		StringBuffer sb = new StringBuffer();
		//StringBuffer sbResult; //stringbuffer면 필요없을 듯.
		
		
		try {
			System.out.print("입력?: ");
			str = input.nextLine();
			sb.append(str); //stringbuffer input
			System.out.println();
			lowerResult = str.toLowerCase();
			upperResult = str.toUpperCase();
			
			for(int i=0;i<str.length();i++) {
				if(Character.isUpperCase(str.charAt(i))) {
					result= result+ Character.toLowerCase(str.charAt(i));
				}
				else {
					result= result+ Character.toUpperCase(str.charAt(i));
				}
			}
			//sb.setCharAt(index, ch);
			//sb.substring(start, end);
			
			int sbIndex=0;
			System.out.println("sb[0]"+sb.charAt(0));
			System.out.println("sb.substring(sbIndex,sbIndex+1): "+sb.substring(sbIndex,sbIndex+1));
			while(sbIndex<sb.length()) {
				if(sb.substring(sbIndex,sbIndex+1) == upperResult.substring(sbIndex, sbIndex+1)) {	
					sb.replace(sbIndex, sbIndex+1, lowerResult.substring(sbIndex, sbIndex+1));
				} else {
					sb.replace(sbIndex, sbIndex+1, upperResult.substring(sbIndex, sbIndex+1));
					
				}
				sbIndex++;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//대소문자 변경해서 출력하기
		System.out.println("lower: "+lowerResult);
		System.out.println("upper: "+upperResult);
		System.out.println("reverse: "+result);
		System.out.println("With StringBuffer(String only): "+sb);
		
		//자바에서는... 가변인자 오버로딩, 오버라이딩이 컴파일러에서 인식을 잘 못한다.
		//JS와는 달리 가변인자가 잘 안쓰이고 컬렉션 등을 사용하는 이유.
        //Varargs v = new Varargs();
        //v.sum("-","a","b","c");
		

	}

}

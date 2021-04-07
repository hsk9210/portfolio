package ex07.coll.list1;

import java.util.Scanner;

public class StringChange2 {

	public StringChange2() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input: ");
		String str = input.nextLine();
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				result += Character.toLowerCase(str.charAt(i));
			}
			else
				result += Character.toUpperCase(str.charAt(i));
		}
		
		System.out.println(result);
	}

}

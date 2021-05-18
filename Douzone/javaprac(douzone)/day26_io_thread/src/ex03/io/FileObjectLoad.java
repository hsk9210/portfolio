package ex03.io;

import java.io.File;

public class FileObjectLoad {

	public FileObjectLoad() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, id, pwd, phone, temp;
		name=id=pwd=phone=temp  = null;
		boolean gender= true;
		int age= 0;
		
		File f = new File("members.txt");
		
		//
		//phone = bis.readObject();
		
		System.out.println("회원정보 콘솔출력창은 하단에 작성하기.");
		
		if(gender == true) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		System.out.println("success file load");

	}

}

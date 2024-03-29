package ex03.io;
import java.io.*;
public class FileObjectLoad {
	public static void main(String[] args)  throws Exception {
		String name, id, pwd, phone, temp;
		name = id=pwd=phone=temp =null;
		boolean gender = true;
		int age = 0;
		
		File f = new File("members.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream bis = new ObjectInputStream(fis);
		
		name = (String)bis.readObject();
		id = (String)bis.readObject();
		pwd = (String)bis.readObject();
		gender = (Boolean)bis.readObject();
		
		age = (Integer)bis.readObject();
		phone = (String)bis.readObject();
		
		System.out.println("\t\t\t >> 회원 정보 << \n");
		System.out.println("이름 \t 아이디 \t  비밀번호 \t   성별 \t    나이   \t    전화번호 \n");
		System.out.print(name + "\t" + id + "\t" + pwd + "\t");
		if( gender == true ) System.out.print("남자");
		else System.out.print("여자");
		System.out.println("\t" + age + "\t " + phone);
		
		System.out.println("Success File Load !!");
		
	}
}









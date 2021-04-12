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
		
		System.out.println("\t\t\t >> ȸ�� ���� << \n");
		System.out.println("�̸� \t ���̵� \t  ��й�ȣ \t   ���� \t    ����   \t    ��ȭ��ȣ \n");
		System.out.print(name + "\t" + id + "\t" + pwd + "\t");
		if( gender == true ) System.out.print("����");
		else System.out.print("����");
		System.out.println("\t" + age + "\t " + phone);
		
		System.out.println("Success File Load !!");
		
	}
}









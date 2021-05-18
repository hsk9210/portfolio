package test;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
	public static List<Person> persons;
	public Client() {
		persons = new ArrayList<Person>();
	}
	public static void main(String[] args) {
		new Client().start();
		
	}
	public static void start() {
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean flag=true;
		while(flag) {
			System.out.println("---------------menu-------------------");
			System.out.print("1: 삽입, 2: 삭제 3: 출력 4:저장 5: 로드 6. 종료");
			menu=sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println(addPerson());
				break;
			case 2:
				deletePerson();
				break;
			case 3:
				getPersons();
				break;
			case 4:
				save();
				break;
			case 5:
				load();
				break;
			case 6:
				flag=false;
				break;	
			default:
				System.out.println("잘못된 메뉴");
				break;
			}
		}
	}
	public static boolean addPerson() {
		Scanner sc = new Scanner(System.in);
		Person temp =new Person();
		float tempB =0;
		System.out.print("이름:");
		 temp.setName(sc.next());
		System.out.print("키:");
		temp.setHeight(sc.nextFloat());
		System.out.print("몸무게:");
		temp.setWeight(sc.nextFloat());
		//set name,height,weight가 설정된 후에 계산하도록 수정중.
		System.out.println(temp.setBmi());
		temp.calBMI();
		//
		persons.add(temp);
		System.out.println(temp.toString());
		return true;
	}
	public static Person getPerson(String name) {
		for(Person temp : persons) {
			if(temp.getName().equals(name)) {
				return temp;
			}
		}
		return null;
		
	}
	public static List<Person> getPersons(){
		for(Person v : persons) {
			System.out.println(v.toString());
		}
		return persons;
	}
	public static boolean deletePerson() {
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.print("이름:");
		name=sc.next();
		Person temp =getPerson(name);
		if(temp==null) {
			return false;
		}
		else {
			persons.remove(temp);
			return true;
		}
	}
	public static boolean save() {
		try {
			File file = new File("bmi.txt");
			FileOutputStream fos =new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(persons);
			
			System.out.println("save");
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public static boolean load() {
		persons.removeAll(persons);
		try {
			File file = new File("bmi.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois =new ObjectInputStream(fis);
			persons=(List)ois.readObject();
			System.out.println("load");
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}





//public class Client {
//
//	public static ArrayList persons;
//	public BMI bmi;
//
//	public Client() {
//		// TODO Auto-generated constructor stub
//		persons =new ArrayList<Person>();
//		bmi = new BMI();
//	}
//
//	public void start() {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int menu;
//		boolean flag = true;
//		while (flag) {
//			System.out.println("menu------------");
//			System.out.print("1: add, 2: delete 3: print 4:save 5: load 6. exit ");
//			menu=input.nextInt();
//			switch (menu) {
//			case 1:
//				System.out.println(bmi.add());
//				break;
//			case 2:
//				System.out.println(bmi.del());
//				break;
//			case 3:
//				System.out.println(bmi.printBMI());
//				break;
//			case 4:
//				System.out.println(bmi.save());
//				break;
//			case 5:
//				System.out.println(bmi.load());
//				break;
//			default:
//				System.out.println("6이상 ~ 잘못된 입력은 종료합니다.");
//				break;
//			}
//			
//			
//		}
//		
//	}
//
//}

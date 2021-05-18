//package test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//
//public class BMI extends Client{
//
//
//	public BMI() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public boolean add() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	public char[] del() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<Person> printBMI() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public char[] save() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static boolean load() {
//		persons.removeAll(persons);
//		try {
//			File file = new File("bmi.txt");
//			FileInputStream fis = new FileInputStream(file);
//			ObjectInputStream ois =new ObjectInputStream(fis);
//			persons=(List)ois.readObject();
//			System.out.println("load");
//			ois.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//		return true;
//	}
//
//}

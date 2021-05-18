package testEx;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Func  {
	float weight;
	float height;
	boolean gender;
	String temp;
	boolean flag = true;

	ArrayList<Body> bs = new ArrayList<Body>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	FileInputStream fis = null;
//	ObjectInputStream bis = null;
//	 oos;
	int no = 0;
	Iterator it;
	File f = new File("BMI.txt");
	

	

	public void first() throws IOException, ClassNotFoundException {

//		 f = new File("BMI.txt");
//		File f = new File("BMI.txt");
		if (f.exists()) {
//			System.out.println("3");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream bis = new ObjectInputStream(fis);
			try {
				
				while (flag) {
					
					weight = ((Float) bis.readObject());
					height = (Float) bis.readObject();
					gender = (boolean) bis.readObject();
					System.out.println(no);
					bs.add(new Body(no, weight, height, gender));
					no++;
					System.out.println(weight);
//					System.out.println("4");
				}
				
			} catch (EOFException e) {
				// 파일의 끝에 도달하면 EOFException이 발생.
				// 그 예외를 처리해주면 정상적으로 처리됩니다!
				System.out.println();
				System.out.println("Success Load File!");
			} finally {
				System.out.println("안녕");
				bis.close();
			} // try end
		}
	}

	public void save() throws IOException {
		
		FileOutputStream fos = new FileOutputStream(f, true); // append mode
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("1");
		try {
			System.out.println("2");	
			
			flag=true;
			while (flag) {
				System.out.println("----------------BMI 정보 입력 하기 ----------------------");
				System.out.print("몸무게 >> ");
				weight = Float.parseFloat(br.readLine());
				System.out.print("키 >> ");
				height = Float.parseFloat(br.readLine());
				System.out.print("성별(m/f) >> ");
				temp = br.readLine();
				if (temp.toUpperCase().equals("M"))
					gender = true;
				else
					gender = false;
				oos.writeObject(weight);
				oos.writeObject(height);
				oos.writeObject(gender);
//				oos.writeObject("\r\n");
				bs.add(new Body(no, weight, height, gender));
				no++;
				System.out.print("More Input? Y or N >> ");

				if (br.readLine().equalsIgnoreCase("N")) {
					flag = false;
				}
				System.out.println("하나");
			} // while end
				
			System.out.println("BMI.txt  save!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		} // try end
	}

	public void remove() throws NumberFormatException, IOException {
		System.out.println("삭제할 번호를 입력하세요");
		int choice = Integer.parseInt(br.readLine());
		it = bs.iterator();
		boolean ck = false;
		while (it.hasNext()) {
			if (((Body) it.next()).getNo() == choice) {
				System.out.println();
				bs.remove(choice);
				ck = true;
				break;

			}
		}
		if (ck) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else
			System.out.println("삭제 할 번호가 존재하지 않습니다.");

		// TODO Auto-generated method stub

	}

	public void print() {
		it = bs.iterator();

		System.out.println("번호\t 몸무게\t 키\t 성별 \t BMI \t 판정");
		while (it.hasNext()) {
			Body a = (Body) it.next();
			int no2 = a.getNo();
			weight = a.getWeight();
			height = a.getHeight();
			gender = a.isGender();
			String temp = gender ? "남자" : "여자";
			float x = gender ? (float) ((height - 100) * 0.9) : (float) ((height - 100) * 0.85);
			System.out.println(x);
			float bmi = weight / (x * x);
			String z;
			if (bmi < 18.5) {
				z = "판정부족";
			} else if (bmi >= 18.5 || bmi <= 22.9) {
				z = "정상";
			} else if (bmi >= 23.0 || bmi <= 24.9) {
				z = "과체중";
			} else {
				z = "비만";
			}

			System.out.println(no2 + "\t" + weight + "\t" + height + "\t" + temp + "\t" + bmi + "\t" + z);
		}

		// TODO Auto-generated method stub

	}

}

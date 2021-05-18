package ex02.IOIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Zreader {

	public Zreader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			//1. fileReading in inner textFile
			Reader reader = new FileReader("src/text.txt");
			int readData;
			char charData[] = new char[100];
			int i=0;
			while ((readData = reader.read()) != -1) {
				charData[i] = (char)readData;				
				i++;
			}
			System.out.println(charData);
			reader.close();
			////////////////////////////
			
			//2. 문제1.
			//Reader 최상위 추상클래스는 메소드가 많지 않다.
			//역시 BufferedReader를 사용한 코드들이 더 좋았다.
			//두 숫자 input
//			Reader x = new InputStreamReader(System.in);
//			System.out.println("input first number?: ");
//			int i1 = x.read()-48;
//			Reader y = new InputStreamReader(System.in);
//			System.out.println("input second number?: ");
//			int i2 = y.read()-48;
//			//연산자 input
//			Reader operator1 = new InputStreamReader(System.in);
//			System.out.println("input operator?: ");
//			int beforeOp = operator1.read();
//			//숫자면 안되니 형변환 캐스팅.
//			char op = (char)beforeOp;
//			System.out.println(op);
//			//분기점이 char형이 된다.
//			switch (op) {
//			case '+':
//				System.out.println(i1 +" "+ op +" "+ i2+ " = "+(i1+i2) );
//				break;
//			case '-':
//				System.out.println(i1 +" "+ op +" "+ i2+ " = "+(i1-i2) );
//				break;
//			case '*':
//				System.out.println(i1 +" "+ op +" "+ i2+ " = "+(i1*i2) );
//				break;
//			case '/':
//				System.out.println(i1 +" "+ op +" "+ i2+ " = "+(i1/i2) );
//				break;
//
//			default:
//				System.out.println(" %나 기타연산자는 미정.");
//				break;
//			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

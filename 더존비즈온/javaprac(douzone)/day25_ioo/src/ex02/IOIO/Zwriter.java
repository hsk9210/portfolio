package ex02.IOIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Zwriter {

	public Zwriter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:\\Users\\MSI1\\Documents\\eclipse-workspace\\day25_ioo\\src\\text.txt");
		Scanner input = new Scanner(System.in);
		System.out.println("입력?: ");
		String inputStr = input.nextLine();
		char data[] = inputStr.toCharArray();
//		for(int i=0;i<data.length;i++) {
//			writer.write(data[i]);
//		}
		writer.write(data);
		writer.flush();
		writer.close();
		//이후, text.txt 파일에 입력이 되었는지 확인하기.

	}

}

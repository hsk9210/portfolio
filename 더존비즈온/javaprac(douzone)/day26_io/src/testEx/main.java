package testEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException {
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Func fn = null;
			
			while (true) {
				fn = new Func();
				fn.first();
				
				System.out.println("======================BMI 프로그램 ==========================");
				System.out.println("1. 추가\t 2. 삭제 3. 출력 4.종료");
				int choice = Integer.parseInt(br.readLine());

				if (choice == 1) {
					fn.save();
				} else if (choice == 2) {
					fn.remove();
				} else if (choice == 3) {
					fn.print();
				} else if (choice == 4) {
					break;
				} else
					System.out.println("잘못된 선택입니다.");
			}
		}
	}

}

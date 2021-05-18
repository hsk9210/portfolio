package ex01.IF;

import java.util.Scanner;

public class Controller_IF2 {

	public Controller_IF2() {
		// TODO Auto-generated constructor stub
	}
	//불합격40, 1회 기회제공75, 2회기회제공60;
	public static void main(String[] args) {
		/**
		 * 윤년 평년
		 * 문제3
		 * if(year%4==0) if(year%100 ==0)
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("year?: ");
		int year = sc.nextInt();
		if(year%4==0 && year%100 !=0) {
			System.out.println("result: 윤년");
		}else if (year%4==0 &&year%100==0 && year%400!=0) {
			System.out.println("result: 평년");
		}else if (year%4==0 &&year%100==0 && year%400==0) {
			System.out.println("result: 윤년");	
		}
				
//		Scanner sc = new Scanner(System.in);
//		System.out.println("int su1, su2 data input: ");
//		double su1 = sc.nextDouble(), su2 = sc.nextDouble();
//		double avg = (su1 + su2)/2;
//		String msg = null;
		
	}

}

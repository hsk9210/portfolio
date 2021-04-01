package day19_basic;

import java.util.Scanner;

public class Work2 {

	public Work2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//과제2. 정수3 입력, 큰 순서대로 정렬. 분기문 위주 코딩.
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3 numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		String answer = "";
		
		/**
		 * tree구조 중 수형도.
		 * 경우의수: 3!(?)
		 * */
		if(x>y) {
			if(y>z) {
				answer = x +">"+y+">"+z;				
			}else if(z>y) {
				if(z>x) {
					answer = z +">"+x+">"+y;						
				} else {
					answer = x +">"+z+">"+y;	
				}
			}
		} else {
			if(x>z) {
				answer = y +">"+x+">"+z;	
			} else if(z>x) {
				if(y>z) {
					answer = y +">"+z+">"+x;	
				}else {
					answer = z +">"+y+">"+x;	
				}
			}
		}
		System.out.println(answer);
		

	}

}

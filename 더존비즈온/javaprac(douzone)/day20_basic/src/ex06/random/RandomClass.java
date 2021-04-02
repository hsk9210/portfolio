package ex06.random;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {

	public RandomClass() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 문제3 난수이용 함수
	 * 업/다운게임 1~100
	 */
	
	//랜덤값 만드는 함수
	public static int random1() {
		Random rand = new Random();
		int result = rand.nextInt(100)+1; //0~99 -> 1~100
		return result;		
	}
	//그냥 게임 자체를 함수화 한다면???
	private static void upDownGame(int y) {
		for(int i=0;i<5;i++) {
			System.out.println("input number: ");
			int x = new Scanner(System.in).nextInt();
			//메소드 안의 메소드가...
			updnchk(x,y);
			
		}		
	}
	//업다운 체크.
	private static void updnchk(int x, int y) {
		// TODO Auto-generated method stub
		if(x == y) {
			System.out.println("correct!");
			System.exit(0);
		} else if (x>y) {
			System.out.println("down");
		} else {
			System.out.println("up");
		}
		
	}
	public static void main(String[] args) {
		
		int question = random1();
		upDownGame(question);
		
		System.out.println("fail");
		System.out.println("answer: "+question);
		
	}

}

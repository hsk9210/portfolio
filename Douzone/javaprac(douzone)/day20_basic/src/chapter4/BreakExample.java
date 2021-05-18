package chapter4;

import java.util.Random;

public class BreakExample {

	public BreakExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int num = (int) (Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("loop break, program fin.");
		
		Random rand = new Random();
		System.out.println(rand.nextInt(9)); //0 ~ n-1
		System.out.println(Math.random());

	}

}

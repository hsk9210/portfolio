package ex01.array;

import java.util.Scanner;

public class ArrayEx02 {

	public ArrayEx02() {
		// TODO Auto-generated constructor stub
	}
	
	public static int rainAvg(int april, double precipitation, double rainArr[]) {
		int avg = 0;
		for(int i=0;i<april;i++) {
			rainArr[i] = (int)(Math.random()*100) + (int)(Math.random()*1000);
		}
		for(int j=0;j<april;j++) {
			avg = avg + (int)rainArr[j];			
		}
		
		return (avg/30);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 문제 2. 기상청
		 * 특정 달(4월)의 30일을 기준으로
		 * 강수량들을 측정하여 평균을 구하는 프로그래밍.
		 * int num =30; 정도로 잡고.
		 * input: 강수량. scanner or Math.random()
		 * processing: 배열은 고정형 30 잡아서 강수량 넣고,
		 *             그거를 30으로 나누는 값을 출력으로 하는
		 *             function을 하나 만들어야 될 듯.
		 * output: 강수량들의 평균.
		 * 
		 * */
		final int APRIL_DAYS = 30;
		
		double precipitation = 0.0;
		
		double rainArr[] = new double[30];
		
		double output = rainAvg(APRIL_DAYS,precipitation,rainArr) + Math.random();
		System.out.println("평균 강수량: "+ String.format("%.1f", output));
		
		
		
		
		
		
		
		
//		int a[] = {1,2,3,4,5};
//		int sum = 0;
//		for(int i=0;i<a.length;i++) {
//			sum += a[i];
//		}
//		System.out.println(sum);
		
//		int arr[] = new int[5];
//		Scanner sc= new Scanner(System.in);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("input number: ");
//			arr[i] = (int)(Math.random()*10);//sc.nextInt();			
//		}
//		int j=0;
//		while (j<arr.length) {
//			System.out.println("arr"+"["+j+"]"+arr[j]);
//			
//			j++;
//		}
		

		
		

	}

}

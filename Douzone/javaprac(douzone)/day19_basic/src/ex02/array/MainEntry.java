package ex02.array;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrSize = 0; //이 값을 조절하면 배열크기 조정.
		int arr1[] = new int[arrSize];
		
		int a4[][] = {{1,7,2,0},{8,3,5,20},{0,0,0,0}};
		int answer[] = new int[4];
		
		for(int i=0;i<a4.length;i++) {
			
			for(int j=0;j<a4[0].length;j++) {
				//a4[i][j] = input something;
				if(i != 2) {
					a4[2][j] = a4[2][j] + a4[i][j];
				}
			}
		} //end for
		
		//3행 결과 출력 반복문
		for(int i=0;i<a4[2].length;i++) {
			System.out.print(a4[2][i]+" ");
			
		}
		
		
		
		//1.
		int a[][] = new int[2][3]; //행,열 크기
		/*
		a[0][0]
		a[0][1]
		a[0][2]
		a[1][0]
		...a
		*/
		//2.
		int a2[][] = new int[][] {{1,2,3}, {4,5,6}};
		
		//3.
//		int a3[][] = {{1,2,3}, {4,5,6}};
//		//System.out.println(a3[0].length);
//		
//		for(int i=0;i<a3.length;i++) { //행 2
//			
//			for(int j=0;j<a3[0].length;j++) { //열3
//				System.out.print(a3[i][j]);
//			}
//			System.out.println();
//		}
		

	}

}

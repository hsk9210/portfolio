package test;

public class javaInsertionSort {
	
	public static int[] insertionSort(int array[]) {
		//int i=1;
		int j,temp;
		
		  for (int i=1; i < array.length; i++) {
			    temp = array[i]; // 새로운 숫자를 선택함
			    for (j = i - 1; j >= 0 && temp < array[j]; j--) { // 선택한 숫자를 이미 정렬된 숫자들과 비교하며 넣을 위치를 찾는 과정, 선택한 숫자가 정렬된 숫자보다 작으면
			      array[j + 1] = array[j]; // 한 칸씩 뒤로 밀어낸다
			    }
			    array[j + 1] = temp; // 마지막 빈 칸에 선택한 숫자를 넣어준다.
			  }		
		
		return array;
	}
	public int[] insertSort(int array[]) {
		int j,temp;
		
		for(int i=1;i<array.length;i++) {
			temp = array[i]; //새로운 숫자를 선택함.
			for(j = i-1; 0<=j && temp < array[j] ;j--) {
				array[j+1] = array[j]; //한 칸씩 뒤로 밀어낸다.
			}
			array[j+1] = temp; //마지막 빈칸에 선택한 숫자를 넣는다.			
		}
		return array;
	}
	
	public static void printArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method
		int bbb[] = {32, 64, 1, 3 ,2};
			int ccc[] = insertionSort(bbb);

		
		
		printArr(ccc);
		
	}

}

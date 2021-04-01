package ex02.array;

public class DementionArr {

	public DementionArr() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][][] = new int[2][2][3];
		int count = 0;
		
		// input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k] += count++;
				}
			}
		}
		
		// input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]);
				}
				System.out.println();
			}
			//System.out.println();
		}

	}

}

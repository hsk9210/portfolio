package iteration;

public class StarMaker {

	public StarMaker() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1.
			*
			**
			***
			****
			*****
		 * 
		 * */
//		for(int i=1;i<=5;i++) {
//			System.out.println();
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//		}
		/**
		 * 2.
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
//		for(int i=5;i>=1;i--) {			
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//		  System.out.println();
//		}
		/**
		 * 3.
		 *    *
		 *   **
		 *  ***
		 * ****
		  *****
		 * */
//		int spaceChk = 0;
//		String star="";
//		int x=1;
//		int y=1;
//		
//		for(x=1;x<=5;x++) {
//			for(y=5;y>=1;y--) {
//				if(x<y) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		
		/**
		 * 4. ?
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 * */
		
		int x=1;
		int y=1;
		
		for(x=1;x<=5;x++) {
			for(y=1;y<=6;y++) {
				if(x<y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/**
		 * 
		 * */
		
		

		

	}

}

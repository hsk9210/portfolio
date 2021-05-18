package chapter4;

public class WhileKeyControlExample {

	public WhileKeyControlExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0, keyCode = 0;
		
		while(run) {
			if(keyCode !=13 && keyCode !=10) {
				System.out.println("00000000000000");
				System.out.println("1. up 2. down 3. stop");
				System.out.println("00000000000000");
				System.out.println("input: ");
				
			}
			keyCode = System.in.read();
			
			if(keyCode==49) {
				speed++;
				System.out.println("current speed: "+speed);
				
			} else if (keyCode==50) {
				speed--;
				System.out.println("current speed: "+speed);
			} else if (keyCode==51) {
				run=false;
			}
			
		}
		System.out.println("fin.");

	}

}

package test;

public class DoWhileLoop {

	public DoWhileLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0; //초기식, 반복을 위한 조건에 사용하는 변수
		do { //무조건 한번은 돌아라.
			System.out.println(num);
			num++;
		} while(num<5); //이러면 0,1,2,3,4 출력
		

	}

}

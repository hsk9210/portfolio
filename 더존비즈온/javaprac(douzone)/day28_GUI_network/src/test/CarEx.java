package test;

public class CarEx {

	public CarEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		mycar.setGas(5);
		//boolean gasstate = mycar.isLeftGas();
		// .isLeftGas() 자체로 boolean값 리턴과 동시에 console 리턴도 있다.
		if(mycar.isLeftGas()) {
			System.out.println("start.");
			mycar.run();			
		} 
		if(!mycar.isLeftGas()) {
			System.out.println("please fill gas.");
		}

	}

}

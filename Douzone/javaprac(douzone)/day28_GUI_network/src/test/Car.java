package test;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
		
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("no gas");
			return false;
		} else {
			System.out.println("still has gas");
			return true;
		}
	}
	void run() {
		while (true) {
			if(gas>0) {
				System.out.println("run. gas: "+gas);
				gas-=1;
			} else {
				System.out.println("stop. gas:"+gas);
				return; //메소드 실행 자체를 종료.
			}
			//type type = (type) en.nextElement();
			
		}
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

}

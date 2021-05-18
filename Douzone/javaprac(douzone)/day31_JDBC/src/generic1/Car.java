package generic1;

public class Car {
	//field
	String model;
	int speed;
	
	//constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String model) {
		this.model = model;
	}
	//method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+" runs. speed: "+this.speed);
		}
	}

}

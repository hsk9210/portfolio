package outerMethodCall;

public class Car {
	//field
	private int speed;
	//constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}
	//methods
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	void keyTurnOn() {
		System.out.println("turn key");
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			setSpeed(i);
			System.out.println("drive.(speed: "+speed+"km/h.)");
		}
	}
	

}

package outerMethodCall;

public class CarEx {

	public CarEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("now.(speed: "+speed+"km/h.)");

	}

}

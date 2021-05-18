package chap06.Classs;

public class CarEx {

	public CarEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("kia", "k5");
		Car c3= new Car("bmw");
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(c3.toString());
		System.out.println(c3.makeString(34243));
		
		
				
	}

}

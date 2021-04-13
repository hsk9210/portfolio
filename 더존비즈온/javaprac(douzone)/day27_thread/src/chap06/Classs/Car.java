package chap06.Classs;

public class Car {
	//field
	String company,model,color;
	int maxSpeed;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String company, String model, String color, int maxSpeed) {
		//super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String company){
		
		this(company,"k5","sliver",250);
	}
	Car(String company, String model){
		this(company,model,"red",240);
	}
	
	public String makeString(Integer a) {
		
		//메소드 선언부 : 메소드 시그니처라고도 한다.
		
		String b = a.toString();
		return b;
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



}

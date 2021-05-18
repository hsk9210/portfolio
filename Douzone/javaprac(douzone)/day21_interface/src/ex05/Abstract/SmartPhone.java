package ex05.Abstract;

public class SmartPhone {
	String color;
	double size;
	int volume;
	
	public SmartPhone(String color, double size, int volume) {
		this.color =color;
		this.size = size;
		this.volume = volume;
	}
	void call() {
		System.out.println("call");
	}
	void volup() {
		volume+=1;
	}
	void voldn() {
		volume-=1;
	}
	
	

}

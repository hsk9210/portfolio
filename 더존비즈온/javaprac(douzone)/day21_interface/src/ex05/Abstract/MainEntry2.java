package ex05.Abstract;

public class MainEntry2 extends SmartPhone {

	public MainEntry2(String color, double size, int volume) {
		super(color, size, volume);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone("red", 10.5, 2);
		System.out.println(sp.color);
		System.out.println(sp.size+" "+sp.volume);
		sp.call();
		sp.color = "blue";
		System.out.println(sp.color);
		
	}

}

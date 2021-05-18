package day27_thread;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=  new UserThread("t1");
		Thread t2=  new UserThread("t2");
		Thread t3=  new UserThread("t3");
		UserThread t4 = new UserThread("t4");
		
		t1.start(); //run()을 유도한다.
		t2.start();
		t3.start();
		t4.start();
		//System.out.println(t1);
		

	}

}
package day27_thread;

public class UserRunnable implements Runnable {
	String name;

	public UserRunnable() {
		// TODO Auto-generated constructor stub
	}
	public UserRunnable(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run(); //오버라이딩할테니 동작을 재정의.
		System.out.println(name);
		System.out.println(name+ "start() 메소드에 의해 run()이 유도된다.(실행대기)");
		
		for(int i=0;i<=9;i++) {
			if(i==7) {
				try {
					Thread.sleep(500); //0.5sec . Runnable 인터페이스는 없는 static 메소드니 Thread. 해서 call해야 한다.
					System.out.println(name);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println(i+" "+name);
		}
	}
	public static void main(String[] args) {
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		
//		Runnable u1 = new UserRunnable("u1");
//		Runnable u2 = new UserRunnable("u2");
//
//		Thread t1= new Thread(u1);
//		Thread t2= new Thread(u2);
//		Thread t3= new Thread(new UserRunnable("u3"));
//		t1.start();
//		t2.start();
//		t3.start();
		
	}

}

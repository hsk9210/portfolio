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
		//super.run(); //�������̵����״� ������ ������.
		System.out.println(name);
		System.out.println(name+ "start() �޼ҵ忡 ���� run()�� �����ȴ�.(������)");
		
		for(int i=0;i<=9;i++) {
			if(i==7) {
				try {
					Thread.sleep(500); //0.5sec . Runnable �������̽��� ���� static �޼ҵ�� Thread. �ؼ� call�ؾ� �Ѵ�.
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

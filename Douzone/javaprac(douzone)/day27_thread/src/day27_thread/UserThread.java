package day27_thread;

public class UserThread extends Thread {
	String name;
	
	public UserThread() {
		
	}
	public UserThread(String name) {
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
					sleep(500); //0.5sec
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println(i+" "+name);
		}


	}
	

}

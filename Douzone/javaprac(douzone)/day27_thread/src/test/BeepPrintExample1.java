package test;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public BeepPrintExample1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		for(int j=0;j<5;j++) {
			System.out.println("��");
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
		Thread thread1 = new Thread(new Runnable() { //�͸� ���� ��ü
						
			@Override
			public void run() {
				// TODO �����尡 ������ �ڵ�.
				//
				
			}
		});
		//run �޼ҵ� �ϳ��� ������ �Լ��� �������̽�.
		//���ٽ��� �Ű������� �ϴ� �͵� �����ϴ�.
		Thread thread2 = new Thread(()->{
			//�����尡 ������ �ڵ�.
		});
		thread2.start();

	}

}

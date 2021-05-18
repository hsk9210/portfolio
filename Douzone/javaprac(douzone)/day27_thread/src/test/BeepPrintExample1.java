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
			System.out.println("땅");
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
		Thread thread1 = new Thread(new Runnable() { //익명 구현 객체
						
			@Override
			public void run() {
				// TODO 스레드가 실행할 코드.
				//
				
			}
		});
		//run 메소드 하나만 있으니 함수적 인터페이스.
		//람다식을 매개값으로 하는 것도 가능하다.
		Thread thread2 = new Thread(()->{
			//스레드가 실행할 코드.
		});
		thread2.start();

	}

}

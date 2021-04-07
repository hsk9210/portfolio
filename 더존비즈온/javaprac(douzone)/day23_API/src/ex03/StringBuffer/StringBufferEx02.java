package ex03.StringBuffer;

public class StringBufferEx02 {

	public StringBufferEx02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("this");
		System.out.println(sb);
		
		StringBuffer stringbuffer = new StringBuffer();
		StringBuilder stringbuilder = new StringBuilder();
		
		new Thread(()->{
			
			for(int i=0;i<100000;i++) {
				stringbuffer.append(i);
				stringbuilder.append(i);
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<100000;i++) {
				stringbuilder.append(i);
				stringbuffer.append(i);
			}
		}).start();
		new Thread(()->{
			try {
				Thread.sleep(5000);
				System.out.println("stringbuffer.length: "+stringbuffer.length());
				System.out.println("stringbuilder.length: "+stringbuilder.length());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}).start();
		
		
	}
		

}

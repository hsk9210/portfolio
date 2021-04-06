package ex00;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 인터페이스도 자료형처럼 된다?
		Trans sub = new Subway();
		Trans bus8 = new Bus();
		sub.start("");
		sub.stop("busan station");
		
		bus8.start("busan station");
		bus8.stop("bexco");
		
		//거꾸로 하려면 메소드 오버라이딩이 강제된다. (9시 반 첫수업 내용 참조.)		
//		Subway sub2 = new Trans() {
//			
//			@Override
//			public void stop(String destination) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void start(String start) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		

	}

}

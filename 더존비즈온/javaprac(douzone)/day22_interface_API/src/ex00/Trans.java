package ex00;

public interface Trans {
	// 부모는 모든 자손에게 상속할 수 있는 최소한의 것
	//1. 추상 메소드  start(), stop();
	//static final int speed = 0;
	static final String defaultPlace[] = {"sungNam", "busan"};
	public abstract void start(String start); // abstract
	public abstract void stop(String destination);
	

}

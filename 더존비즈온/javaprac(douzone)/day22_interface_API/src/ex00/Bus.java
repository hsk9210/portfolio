package ex00;

public class Bus implements Trans {

	public Bus() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(String start) {
		// TODO Auto-generated method stub
		System.out.println("transferred from subway,"+start+" into Bus.");

	}

	@Override
	public void stop(String destination) {
		// TODO Auto-generated method stub
		System.out.println("드디어 "+destination+"에 도착.");

	}

}

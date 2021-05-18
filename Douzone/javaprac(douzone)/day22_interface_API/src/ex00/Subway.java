package ex00;

public class Subway implements Trans {

	public Subway() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(String start) {
		// TODO Auto-generated method stub
		String start1 = start;
		if(start =="") {
			start1 = defaultPlace[0];
		}
		System.out.println("start from "+start1+".");

	}

	@Override
	public void stop(String destination) {
		// TODO Auto-generated method stub
		System.out.println("Arrived at "+destination+".");
	}

}

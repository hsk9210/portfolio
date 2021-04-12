package test;

public class SmartPhoneController extends SmartPhoneDAO{
	private String color;
	private double size;
	private int volume;
	
	public SmartPhoneController(SmartPhoneDAO dao) {
		// TODO Auto-generated constructor stub
		color = dao.getColor();
		size = dao.getSize();
		volume = dao.getVolume();		
	}
	public SmartPhoneController() {
		
	}

	@Override
	public String toString() {
		return "SmartPhoneController [color=" + color + ", size=" + size + ", volume=" + volume +  "]";
	}
	

	



}

package test;

public class MainEntrySP {

	public MainEntrySP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhoneDAO dao = new SmartPhoneDAO();
		dao.setColor("red");
		dao.setSize(3.14);
		dao.setVolume(4);
		SmartPhoneController con = new SmartPhoneController(dao);
		System.out.println(con.toString());
		
	}

}

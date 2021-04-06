package ex04.userException;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}
	public void test1(String n[]) throws UserException{
		System.out.println("");
		if(n.length<1) {
			throw new UserException("nothing");
		}
		else {
			throw new UserException("fianl", 703); //강제 exception 발생
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainEntry ut = new MainEntry();
		try {
			ut.test1(args);
			
		} catch (UserException ue) {
			// TODO: handle exception
			ue.printStackTrace();
		}

	}

}

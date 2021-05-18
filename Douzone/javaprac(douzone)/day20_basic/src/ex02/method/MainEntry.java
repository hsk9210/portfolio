package ex02.method;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			if(args.length != 0) {
				int h = Integer.parseInt(args[0]) +Integer.parseInt(args[1]);
				System.out.println(h+" "+args[0]+" "+args[1]);			
			}
			else {
				System.out.println("plz input main argument");
				System.exit(0);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

			


	}

}

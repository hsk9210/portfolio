package ex02.di;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewRecode recode = new NewRecode(30,40,50,60);
				
		NewCodeView view = new NewCodeView(recode);
		view.setRecode(recode);
		view.result();
		

	}

}

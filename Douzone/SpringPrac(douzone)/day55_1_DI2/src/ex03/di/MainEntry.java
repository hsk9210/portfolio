package ex03.di;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewRecode record = new NewRecode();
		NewCodeView view = new NewCodeView(record);
		//view.setRecode(record); new와 set중 택일.
		view.input();
		view.result();
		
		
		

	}

}

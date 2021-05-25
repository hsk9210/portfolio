package ex01.di;

public class NewCodeView {
	private NewRecode recode;

	public NewCodeView(int kor, int eng, int math, int com) {
		super();
		recode = new NewRecode(kor, eng, math, com);
	}
	
	public void result() {
		System.out.println(recode.total() + " "+ recode.avg());
	}
	
	
	

}

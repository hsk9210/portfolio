package ex02.di;

public class NewCodeView {
	private NewRecode recode;

	public NewCodeView(NewRecode recode) {
		this.recode = recode;
	}
	
	
	public NewRecode getRecode() {
		return recode;
	}

	public void setRecode(NewRecode recode) {
		this.recode = recode;
	}


	public void result() {
		System.out.println(recode.getCom()+" "+recode.getEng()+" "+recode.getKor());
		System.out.println(recode.total() + " "+ recode.avg());
	}
	
	
	

}

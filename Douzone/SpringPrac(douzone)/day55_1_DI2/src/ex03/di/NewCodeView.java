package ex03.di;

import java.util.Scanner;

public class NewCodeView implements IRecordView{
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

	@Override
	public void result() {
		System.out.println(recode.getMath()+" "+recode.getEng()+" "+recode.getKor());
		System.out.println(recode.total() + " "+ recode.avg());
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("kor: ");
		recode.setKor(sc.nextInt());
		System.out.println("eng: ");
		recode.setEng(sc.nextInt());
		System.out.println("math: ");
		recode.setMath(sc.nextInt());
		
	}
	
	
	

}

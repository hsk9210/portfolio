package ex03.di;

public class NewRecode implements IRecord{
	private int kor,eng,math,com;
	public NewRecode() {
		this(0,0,0,0);		
	}

	public NewRecode(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	@Override
	public int total() {
		return this.kor+this.eng+this.math;
	}
	@Override
	public double avg() {
		return (this.kor+this.eng+this.math)/3;
	}
	
	
	

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	

}

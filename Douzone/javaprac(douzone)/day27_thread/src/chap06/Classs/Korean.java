package chap06.Classs;

public class Korean {
	String nation,name,ssn;
	
	//생성자 오버로딩
	public Korean(String nation, String name, String ssn) {
		this.name=  name;
		this.ssn = ssn;//this는 객체 자기 자신의 참조.
		this.nation = nation;//this라는 참조 변수로 필드를 사용한다.
	}
	public Korean(String nation, String name) {
		this(nation,name,"");
	}	
	public Korean() {
		// TODO Auto-generated constructor stub
	}
	public Korean(String name) {
		this(name, "0000");
	}

}

package chap06.Classs;

public class KorEx {

	public KorEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("aaa", "000000-0102938");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("bbb", "111111-0102938");
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}

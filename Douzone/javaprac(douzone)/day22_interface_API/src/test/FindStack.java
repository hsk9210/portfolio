package test;

public class FindStack {

	public FindStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char v1 = 'A';
		int v5[] = {1,2};
		int v6[] = new int[3];
		if(v1=='A') {
			int v2 = 100;
			double v3 = 3.14;
			v6[0] = 3;
		}
		int v7[] = {1,2};
		boolean v4 = true;
		System.out.println(v5.hashCode());
		System.out.println(v6.hashCode());
		System.out.println(v7.hashCode());
		String ref1 = "1";
		String ref2 = "2";
		String ref3 = ref2;
		System.out.println(ref1==ref2);
		System.out.println(ref2==ref3);

	}

}

package ex05.Abstract;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect();
		r.show("rectangle");
		
		Shape re = new Rect();
		re.show("aaa");
		System.out.println(re.calc(3, 4));
		//3 Array
		Shape ss[] = new Shape[3];
		ss[0] = new Rect();
		ss[1] = new Rect();
		ss[2] = new Rect();
		String name[] = {"Circle", "Rect", "aaa"};
		for(int i=0;i<ss.length;i++) {
			ss[i].show(name[i]);
		}
		

	}

}

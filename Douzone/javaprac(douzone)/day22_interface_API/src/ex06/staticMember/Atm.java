package ex06.staticMember;

public class Atm {

	int count;
	static int total;

	public Atm(int amount) {
		// TODO Auto-generated constructor stub
		count+=amount;
		total+=amount; //
	}
	public static void show(int count, int total) {
		//cannot use this in static context
		//this.count = count;
		//count = count;
	}
	
	public void disp() {
		System.out.println(count);
		System.out.println(total);
	}

}

class MainEntry{
	public static void main(String args[]) {
		System.out.println(Atm.total);
		Atm a = new Atm(1000);
		a.disp(); //1000 1000
		System.out.println("---------------");
		Atm b = new Atm(2000);
		b.disp(); //2000 3000
		System.out.println("---------------");
		Atm c = new Atm(3000);
		c.disp(); //3000 6000
		System.out.println("---------------");
	}
}
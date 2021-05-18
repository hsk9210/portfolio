package generic1;

public class Box {
	private Object object;
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
	//이러면 Object object=  자바의 모든 객체!;
	

	public Box() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.set("aaa");
		String name = (String) box.get(); // 이렇게 강제 타입 변환이 필요.

	}

}

package generic1;



public class ProductExample {

	public ProductExample() {
		// TODO Auto-generated constructor stub
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
	}

}

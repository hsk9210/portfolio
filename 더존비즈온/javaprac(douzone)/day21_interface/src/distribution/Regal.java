package distribution;

public class Regal extends Sales{
	private double salary;
	private double commission;
	private double commiPer;
	
	public Regal(double commiPer, double commission) {
		// TODO Auto-generated constructor stub
		//상위클래스의 생성자 호출
		super(commiPer, commission); // 상위클래스에서 받아오지 않으면 값이 넘어오지 않으니 식이 꼬인다?
		this.commiPer = commiPer;
		this.commission = commission;		
	}
	//Sales.getCommission() 을 사용.	
	public double getSalary() {
		return salary + getCommission();
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

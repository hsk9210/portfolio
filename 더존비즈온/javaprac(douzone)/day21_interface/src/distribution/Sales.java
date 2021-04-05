package distribution;

public class Sales {
	
	private double commiPer = 0.5;
	private double commission = 1;

	public double getCommiPer() {
		return commiPer;
	}

	public void setCommiPer(double commiPer) {
		this.commiPer = commiPer;
	}
	// 생성자에서는 그대로
	public Sales(double commiPer, double commission) {
		// TODO Auto-generated constructor stub
		this.commiPer = commiPer;
		this.commission = commission;
	}
	//커미션을 받으려면 비율과 건수를 곱해야?
	public double getCommission() {
		return commission*commiPer;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

}

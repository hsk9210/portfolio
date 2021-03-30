package quiz;

public class Quiz_Operator {

	public Quiz_Operator() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 문제 1: 
		 * input : int pay = 567890;
		 * output: 
		 * result> 만원: 56장, 천원: 7장, 백원: 8개, 십원: 9개
		 * 
		 * */
		//방법 1
		int pay = 567890;
		int p10000 = 10000; //그대로?
		int p1000 = 81; //81
		int p100 = 709; //709
		int p10 = 6309; //6309
		System.out.println("result> 만원: "+(pay/p10000)+"장,"+" 천원: "+(pay/p1000/1000)+"장,"+" 백원: "+(pay/p100/100)+"개,"+" 십원: "+(pay/p10/10)+"개");
		//방법 2 저장
//		int pay = 567890;
//		System.out.println(pay/10000);
//		pay = pay - (pay/10000)*10000;
//		System.out.println(pay/1000);
//		pay = pay - (pay/1000)*1000;
//		System.out.println(pay/100);
//		pay = pay - (pay/100)*100;
//		System.out.println(pay/10);
//		//방법 3 저장
//		int pay2 = 567890;
//		System.out.println((pay2/10000));
//		System.out.println((pay2%10000)/1000);
//		System.out.println((pay2%1000)/100);
//		System.out.println((pay2%100)/10);

	}

}

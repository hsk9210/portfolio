package distribution;

import java.util.Scanner;

public class Employee{


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regal r = new Regal(0.5, 1); //이거 초기값 필요없게 만들도록 수정하기.(없으면 더좋고.)
		
		Scanner input = new Scanner(System.in);
				
		//이름 직급 부서 연락처
		String name = "";
		String position = "";
		String department = "";
		String contract = "";
		
		
		System.out.print("input name: ");
		name = input.nextLine();
		System.out.print("input position: ");
		position = input.nextLine();
		System.out.print("input department: ");
		department = input.nextLine();
		System.out.print("input contract: ");
		contract = input.nextLine();
		//System.out.println(name+position+department+contract);
		System.out.print("set your commission: ");
		r.setCommission(input.nextDouble()); //Sales 객체에서 Regal을 거쳐 넘어온 커미션 건수를 입력하고
		System.out.print("set your salary: ");
		r.setSalary(input.nextDouble()); //월급은 그냥 바로 윗단에 입력.
		System.out.println("------------------");
		System.out.println(" name: "+name+" position: "+ position +" salary: "+ r.getSalary() +" commission: "+ r.getCommission());
		System.out.println("------------------");
		
	}

}

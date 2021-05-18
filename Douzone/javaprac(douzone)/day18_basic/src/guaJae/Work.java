package guaJae;
import java.util.*;

public class Work {

	public Work() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 과제1. 국어 영어 전산 점수 입력
		 * 평균 60 이상이 아니고 각 과목 과락 40점 이하면 과목 불합격 처리
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();	
		System.out.print("국어 점수 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 점수 : ");
		double eng = sc.nextDouble();
		System.out.print("전산 점수 : ");
		double com = sc.nextDouble();
		
		double total = (kor+eng+com);
		double avg = Math.round(total/3*100)/100;
		// + - 를 붙이기 위해 String type addon
		String grade = ""; 
		String pm = ""; //+ or -
		
		
		if(avg>=90) {
			grade = "A";
		}else if (avg>=80) {
			grade = "B";
		}else if (avg>=80) {
			grade = "C";
		}else if (avg>=70) {
			grade = "D";
		}else {
			grade = "F";
		}
		pm = ((avg%10) >=5) ? "+":"-" ;
		System.out.println("total: "+total+", avg: "+avg);
		System.out.println("grade: "+grade+pm);
		
		//불합격 사유 추가. 삼항연산자 중첩 +
		if( avg<60 || (kor<=40||eng<=40||com<=40) ) {
			String failBec = "";
			failBec = kor<=40 ? "kor" : (eng<=40 ? "eng" : "com") ;
			System.out.println("불합격. 사유: "+failBec);			
		}
		

	}

}

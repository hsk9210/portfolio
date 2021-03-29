package quiz;
import java.util.*;

/** //자료형을 이용해서 성적처리 및 정보 출력
 * 국 영 전산 점수를 임의적으로 부여하고 총점/평균 출력 
 * 이름, 키(실수형), 몸무게(실수형)으로 정보 넣고 출력하는 프로그램도 작성
 * 
 * */
public class MainEntry {
	public static void main(String[] args) {
		//java식 입력 클래스 사용법
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		//난수 (1~9까지만)를 만드는 식
	    double dValue = Math.random();
	    int randomValue = (int)(dValue * 10);
	    
	    // var initialize
	    int kor, eng, CS, total, avg = 0;
	    
	  
	    kor   = randomValue*10; //국어
	    eng   = randomValue*9; //영어
	    CS    = randomValue*8; //전산
	    total = (kor+eng+CS);     //총점
	    avg   = (kor+eng+CS) / 3;  //평균
	    
	    //console 출력
	    System.out.println("국어: "+kor);
	    System.out.println("영어: "+eng);
	    System.out.println("전산: "+CS);
	    System.out.println("총점: "+total);
	    System.out.println("평균: "+avg);
	    
	    System.out.println("\n\n 이름, 키, 몸무게 순서대로 입력을 한번씩 하고 엔터.");
	    String name = scan1.next();
	    double height = scan2.nextDouble();
	    double weight = scan3.nextDouble();
	    //console출력2
	    System.out.println("이름: "+name+" 키: "+height+" 몸무게: "+weight);
	    	
		
	}
	

}

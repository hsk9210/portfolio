package ex01.oop;

import java.util.Scanner;

public class MainEntry2 {

	public MainEntry2() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 문제: 4. 성적처리 프로그램을 클래스로 구현하기
	 */
	
	/*총점 평균 석차까지 3행 4열 [학생수][] 이런 식으로 변경중*/
	
	// 학생수 설정 변수 추가.
	//********************************************************
	final static int STUDENT_NUM = 2; // 중요. 이 숫자를 바꾸면 학생수가 설정됨.
	//********************************************************
	
	//2차원 배열을 사용할 시, 필요한 배열의 용량: [STUDENT_NUM][3] * 2
	// String이름1+double국영수3 String국영수등급3 학생별총점평균2
		
	// var initialize.
	double input=0.0;
	static String name[] = new String[STUDENT_NUM];
	//등급 표시할 변수 추가.
	String grade = "",korgrade = "",enggrade = "",comgrade = "",avggrade = "";
	static double scoreData[][] = new double[STUDENT_NUM][5];
	/*
	 * scoreData[][0] : kor
	 * scoreData[][1] : eng
	 * scoreData[][2] : com
	 * scoreData[][3] : total
	 * scoreData[][4] : avg
	 * [STUDENT_NUM][5]
	 * */
	//total, avg는 이미 scoreData[][] 하나 구간에 다 들어있지만... 요구스펙에 따르면 추출해서 담을 공간으로 보내야 한다.
	static double totalScore[] = new double[STUDENT_NUM];
	static double averageScore[] = new double[STUDENT_NUM];
	
	static Scanner sc = new Scanner(System.in);
	
	//총점함수
	private static String total(int people) {
		// TODO Auto-generated method stub
		String output = "";
		for(int i=0;i<people;i++) {
			output = output + scoreData[i][3] + " | "; 
		}
		return "전체 사람들 점수(이름 추가는 제작중):"+output;
				
	}
	
	//평균함수는 귀차니즘. 그냥 input에 들은 기능을 재활용 ㄱ.
	private static void average() {
		// TODO Auto-generated method stub
		for(int a=0;a<STUDENT_NUM;a++) {
			System.out.println(averageScore[a]);				
		}
	}	
	
	//입력함수
	public static void input() {
		
		int count = 0; //무한루프 카운터. 끝에서 학생수와 비교하여 breaking에 사용.
		try { //반복문에 안붙어 있으면 typeMismatch에서 멈춘다?
			
			while(true) {
											
				System.out.println("name: ");
				name[count] = new Scanner(System.in).nextLine();
				// 국영컴 점수 전체 입력. 학생수 만큼.
				do { //kor
					System.out.println("kor? : ");
					scoreData[count][0] = sc.nextDouble();
				} while(scoreData[count][0]<0 || scoreData[count][0]>100);
				do { //eng
					System.out.println("eng? : ");
					scoreData[count][1] = sc.nextDouble();
				} while(scoreData[count][1]<0 || scoreData[count][1]>100);
				do { //com
					System.out.println("com? : ");
					scoreData[count][2] = sc.nextDouble();
				} while(scoreData[count][2]<0 || scoreData[count][2]>100);
				
				//total
				totalScore[count] =  scoreData[count][3] = scoreData[count][0] + scoreData[count][1] +scoreData[count][2];
				//avg  Math.round(total/3*100)/100;
				averageScore[count] = scoreData[count][4] = Math.round(scoreData[count][0] + scoreData[count][1] +scoreData[count][2])/3*100/100 ;
				
				
				count++; //한명 끝, 카운터 올리고,	
				
				if(STUDENT_NUM<=count) { //학생수를 다 채웠으면 무한루프 fin.
					break; //이걸 앞에서 사전검증하지 않으면 java.lang.ArrayIndexOutOfBoundsException: count 뿜뿜
				}
									
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
	}
	
	//등급계산기 Function
	public static String grade (double input) {
		// + - 를 붙이기 위해 String type add-on
		String pm = ""; //+ or -
		String grade = "";
		switch ((int)input/10) {
		case 10:
		case 9:
			grade= "A";
			break;
		case 8:
			grade= "B";
			break;
		case 7:
			grade= "C";
			break;
		case 6:
			grade= "D";
			break;
		default:
			grade= "F";
			break;
		} //switch end
		pm = (((int)input%10) >=5) ? "+":"-" ;
		return grade+pm;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input();
		System.out.println(total(STUDENT_NUM));
		average();
		
		//grade(input); //2차원 배열 하나하나 적용하려면 스파르타... 이건 패스.
		
		output();
		
		

	}



	private static void output() {
		// TODO Auto-generated method stub
		
		//function을 사용하여 등급 붙이는거 임시제거.
//		korgrade = gradeCal(kor);
//		enggrade = gradeCal(eng);
//		comgrade = gradeCal(com);
		
		for(int i=0;i<STUDENT_NUM;i++) {
				
				System.out.println("name: "+name[i]);
				System.out.println("your score: ");
				System.out.println("kor"+scoreData[i][0]+" "+"eng"+scoreData[i][1]+" "+"com"+scoreData[i][2]+" "+"total"+scoreData[i][3]+" "+"avg"+scoreData[i][4]+" ");
		}
	

		/*
		 * 불합격 사유 추가. 삼항연산자 중첩 +
		     이러면 불합격사유가 앞의 하나만 나온다, 이러니 개선해야됨.
		     + 2차원 배열로 바꾸면 불합격 사유까지 중복되어 나온다, 수정할 것.			     
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
		   at ex05.DoWhile.MainEntry.main(MainEntry.java:132)
		 * */
		for(int i=0;i<STUDENT_NUM;i++) {
			for(int j=0;j<5;j++) {
				if( scoreData[i][3]<60 || (scoreData[i][2]<=40||scoreData[i][1]<=40||scoreData[i][0]<=40) ) {
					String failBec = "";
					failBec = scoreData[i][0]<=40 ? "kor" : (scoreData[i][1]<=40 ? "eng" : "com") ;
					System.out.println("불합격. 사유: "+failBec);			
				}
				
			}
		}
		
	}



}

package ex02.exception;

import java.util.Scanner;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		try {
			/**
			 * 문제4. 사칙연산 프로그램(예외처리)
			 * 숫자 2개 입력, 산술연산자 중 1개 입력 받아서 실행후 결과 출력.
			 * if, switch 이용
			 * 
			 * result>
			 * 3
			 * 5
			 * 3 + 5 = 8
			 * */
			Scanner sc = new Scanner(System.in);
			System.out.println("input operand1: ");
			int x = sc.nextInt();
			System.out.println("input operator: ");
			String op = sc.next();
			System.out.println("input operand2: ");
			int y = sc.nextInt();
			
			System.out.println("result>");
			System.out.println(x+"\n"+y+"\n"+op);
			switch (op) {
			case "+":
				System.out.println(x+" + "+y+" = "+(x+y));
				break;
			case "-":
				System.out.println(x+" - "+y+" = "+(x-y));
				break;
			case "*":
				System.out.println(x+" * "+y+" = "+(x*y));
				break;
			case "/":
				System.out.println(x+" / "+y+" = "+(x/y));
				break;

			default:
				break;
			}
			
			
			
//			Scanner sc = new Scanner(System.in);
//			int month = sc.nextInt();
//			
//			switch(month) {
//			case 1:
//			case 3:
//			case 4:
//				System.out.println(month+"월의 마지막 날은 31일 입니다.");
//				break;
//			case 5:
//			case 6:
//			case 7:
//				System.out.println(month+"월의 마지막 날은 30일 입니다");
//				break;
//			case 2:
//				System.out.println(month+"월의 마지막 날은 28일 입니다");
//				break;
//			default:
//				System.out.println("error");
//				break;
//			}
			
			
			
			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("이름 : ");
//			String name = sc.nextLine();	
//			System.out.print("국어 점수 : ");
//			double kor = sc.nextDouble();
//			System.out.print("영어 점수 : ");
//			double eng = sc.nextDouble();
//			System.out.print("전산 점수 : ");
//			double com = sc.nextDouble();
//			
//			double total = (kor+eng+com);
//			double avg = Math.round(total/3*100)/100;
//			// + - 를 붙이기 위해 String type addon
//			String grade = ""; 
//			String pm = ""; //+ or -
//			
//			// ......casting 한번, 나누어서 숫자로 구분 한번.
//			int switchAvg = (int)avg/10;			
//			switch(switchAvg) {
//			case 9:
//				grade = "A";
//				break;
//			case 8:
//				grade = "B";
//				break;
//			case 7:
//				grade = "C";
//				break;
//			case 6:
//				grade = "D";
//				break;
//			default:
//				grade = "F";
//				break;
//			}
//			
//			pm = ((avg%10) >=5) ? "+":"-" ;
//			System.out.println("total: "+total+", avg: "+avg);
//			System.out.println("grade: "+grade+pm);
			
			
			
			

//			for(int i=0;i<3;i++) {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("도시를 선택하세요(서울,부산,대구,제주이고 3번의 기회.): ");
//				String city =sc.next();
//				if(city.equals(null)) {}
//				
//				switch (city) { //조건 문자형 long제외 정수형 (실수형x)
//				case "서울":
//					System.out.println("\n서울");
//					break;
//				case "부산":
//					System.out.println("\n부산");
//					break;
//				case "대구":
//					System.out.println("\n대구");
//					break;
//				case "제주":
//					System.out.println("\n제주");
//					break;
//				default:
//					System.out.println("error");
//					break;
//				} //switch end
//				//sc.close();					
//			} //for end
			
			/**
			 * for(1초기화;2조건식;4증감식){
			 *   3조건식이 true면 괄호안 실행
			 * }
			 * */
			
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
//		try {
//			System.out.println("x,y= ");
//			Scanner sc = new Scanner(System.in);
//			int x = sc.nextInt();
//			int y = sc.nextInt();		
//			System.out.println(x/y);
//			
//		}catch (ArithmeticException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("eee"); //e.getMessage()
//			//e.printStackTrace();
//		}finally {
//			System.exit(0);
//		}
		
		
	}

}

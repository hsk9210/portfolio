package time1;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class TimeCal {

	public TimeCal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//next vs nextLine
//		System.out.println("string input: ");
//		String s1 = sc.nextLine();
//		System.out.println("\ninput data:  "+s1);
//		System.out.println("number input: ");
//		System.out.println(sc.nextInt()+ ", " + sc.nextDouble());
//		
		
		
//		try {
		    /**
		     * 이도연님의 성적표
		     * 국어100 영어100 전산100 총점300 평균100,00
		     * 
		     * */
		    System.out.println("이름 입력: ");
		    sc.nextLine();
		    System.out.println("--------");
		    System.out.println("성적 입력\n");
		    System.out.println("국어: ");
		    int kor = sc.nextInt();
		    System.out.println("영어: ");
		    int eng = sc.nextInt();
		    System.out.println("전산: ");
		    int cs = sc.nextInt();
		    System.out.println("--------\n");
		    System.out.println("result> \n이도연님의 성적표 ****************************\n");
		    System.out.println("국어:"+kor+ " 영어: "+eng+ " 전산: "+cs+"\n" );
		    System.out.println("총점: "+(kor+eng+cs)+" 평균: "+(Math.round( (double)(kor+eng+cs)/3*100 )/100.0)  );
		    
		    

			
			
			
			
//			System.out.println("초 입력: ");
//			int inputTime = scan1.nextInt();
//			
//			
//			//int su  =123456;
//			//시 분 초 60분 60초
//			
//			int su = inputTime; //123456; //초???
//			int hour1,minute1,second1  = 0;
//			
//			hour1 = su/3600; //60초1분 * 60분1시간
//			minute1 = su%3600/60; //일단 나누면 400초가 남음. 거기서 받아내자.
//			second1 = ((su%3600)%60);
//			System.out.println(hour1+"시간 "+minute1+"분 "+second1+"초");
						
			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		} finally {
//			System.out.println("fin");
//		}


	}

}

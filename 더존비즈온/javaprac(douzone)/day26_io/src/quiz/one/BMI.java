	/*static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String name() throws IOException {
		System.out.print("이름을 입력하세요 : ");
		String name = br.readLine();
		return name;
	}
	static String weight() throws IOException {
		System.out.print("몸무게를 입력하세요 : ");
		String wei = br.readLine();
		Integer.parseInt(wei);
		return wei;
	}
	static String height() throws NumberFormatException, IOException {
		System.out.print("키를 입력하세요 : ");
		String hei = br.readLine();
		Integer.parseInt(hei);
		return hei;
	}
	public static void main(String[] args) throws Exception {
		System.out.println("이름 : " + name() + "\t몸무게 : " + weight() + "\t키 : " + height());
	}*/
package quiz.one;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
	protected String name , weight , height;
	static int wei , hei;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static BMI input(BMI bmi) throws IOException {
		System.out.println("이름을 입력하세요 : ");
		bmi.name = br.readLine();
		System.out.print("몸무게를 입력하세요 : ");
		/*String strW = br.readLine();
		wei = Integer.parseInt(strW);*/
		wei = Integer.parseInt( br.readLine());
		//bmi.weight = wei;
		System.out.print("키를 입력하세요 : ");
		hei = Integer.parseInt(br.readLine());   //
		
		//BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) )  ;
		double sum = wei / ( (hei  / 100.0)  * (hei / 100.0) ) ;
		
		if(sum < 18.5) System.out.println("체중부족입니다.");
		else if(sum>=18.5 && sum <=22.9) System.out.println("정상체중입니다.");
		else if(sum>=23.0 && sum <=24.9) System.out.println("과체중입니다.");
		else System.out.println("비만입니다!!! 다이어트 필수입니다!!!");
		
		return bmi;
	}
}
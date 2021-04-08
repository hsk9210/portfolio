package zVideo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainEntry extends Video{

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}
	
	//Video 리스트 출력 메소드 분리. forEach 사용으로.
	//iteratorUsingForEach 방식 사용.
    static void outPut(Map map){
        Set<Map.Entry<StringBuffer, Video>> entries = map.entrySet();
        for (Map.Entry<StringBuffer, Video> entry : entries) {
            System.out.println("컬럼. '"+ entry.getKey() + "' 의 데이터 주소: " + entry.getValue());
            System.out.println(entry.getValue().display());
        }
    }
	

	public static void main(String[] args) {
		//HashMap 사용 요구사항.
		Map m = new HashMap<StringBuffer, Video>();
		
		/*
		 * Video 추가.
		 * 나중에는 출력 메소드처럼,
		 * 수정이 빈번한 항목만 StringBuffer로,
		 * 나머지는 String으로 변경하기.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("title 입력?: ");
		StringBuffer title = new StringBuffer();		title.append(input.nextLine());
		System.out.print("category 입력?: ");
		StringBuffer category = new StringBuffer();		category.append(input.nextLine());
		System.out.print("lend 입력?: ");
		StringBuffer lend = new StringBuffer();		    lend.append(input.nextLine());
		System.out.print("lendName 입력?: ");
		StringBuffer lendName = new StringBuffer();		lendName.append(input.nextLine());
		System.out.print("lendDate 입력?: ");
		StringBuffer lendDate = new StringBuffer();		lendDate.append(input.nextLine());
		
		 
		Video value = new Video(title, category, lend, lendName, lendDate);
		StringBuffer titleKey = title;
		m.put(titleKey, value);
		/*-----------------------------------------*/
		
		
		/*
		 * 수정, 종료는 시간상 생략.
		 * 
		 * */
		
		
		//Video 리스트 출력
		Set set1 = m.entrySet();
		
		Iterator itr = set1.iterator();
		//Map은 collection 인터페이스가 아님. 사용불가.
		//Collections.sort();
		
		outPut(m);

	}

}

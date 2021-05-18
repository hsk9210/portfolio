package ex05.util;

import java.time.Month;
import java.util.Calendar;

public class CalendarEx1 {

	public CalendarEx1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String day[] = {"", "일","월","화","수","목","금","토"};
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		d1.set(2021,04,07);
		System.out.println(d1.get(Calendar.DATE));
		System.out.println(d1.get(Calendar.AM));
		System.out.println(d1.getTime());

	}

}

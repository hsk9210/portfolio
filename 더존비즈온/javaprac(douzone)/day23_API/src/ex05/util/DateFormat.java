package ex05.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public DateFormat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat df,df2;
		df= new SimpleDateFormat("yyyy-MM-dd");
		df2 = new SimpleDateFormat("hh:mm:ss a EEEE");
		System.out.println(today);
		System.out.println(df.format(today));
		System.out.println(df2.format(today));
		
		
		

	}

}

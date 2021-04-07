package ex03.utilPackage;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 달력 class
		Calendar c=  Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		
		// time class
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd hh:mm");
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(d.getTime()));
		

	}

}

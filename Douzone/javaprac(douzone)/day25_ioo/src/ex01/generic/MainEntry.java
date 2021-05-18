package ex01.generic;

import java.util.Collections;
import java.util.List;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericEx<String> t1 = new GenericEx<>();
		String str[]=  {"adb", "aaa"};
		t1.setT(str);
		System.out.println(t1.display());
		
		GenericEx ti = new GenericEx<>();
		Integer num[] = {1,10,3,45,1};
		ti.setT(num);
		//List aaa = (List)num;
		//Collections.sort(num);
		System.out.println(ti.display());
		
		GenericEx t3 = new GenericEx<>();
		Double su[] = {3.11,333.33,4433.22};
		t3.setT(su);
		System.out.println(t3.display());

	}

}

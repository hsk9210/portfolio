package day24_API2;

import java.util.ArrayList;
import java.util.Collections;



public class ArrList1 {

	public ArrList1() {
		// TODO Auto-generated constructor stub
	}
	public static void print1(Object al) {
		System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		//System.out.println(al.size());
		for(int i=10;i>=1;i--) {
			al.add(new Integer(i));			
		}
		print1(al);
		Collections.sort(al);
		print1(al);
		
		ArrayList al2 = new ArrayList<>(al.subList(0, 4));
		print1(al2);
		al2.add(2, "ggg");
		print1(al2);
		al2.remove("ggg");
		print1(al2);
		print1(al2.size());
		for(int i=0;i<al2.size()-1;i++) {
				al2.remove(0);		
				al2.remove(1);
								
		}
		print1(al2);

		
		
		
//		int a[] = {1,2,3};
//		print1(al.add(a));
//		print1(al.contains(a));
//		print1(al.set(0, 1));
//		print1(al.get(0));
//		print1(al.isEmpty());
//		print1(al.size());
		
		

	}

}

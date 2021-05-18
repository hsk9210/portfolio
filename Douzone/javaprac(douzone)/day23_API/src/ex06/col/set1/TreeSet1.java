package ex06.col.set1;

import java.util.*;
import java.util.Collection;
import java.util.Collections;


public class TreeSet1 {

	public TreeSet1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts1 = new TreeSet();
		int score[] = {45,67,86,34,56,12,300};
		
		try {
			int i=0;
			while(i<score.length) {
				ts1.add(new Integer(score[i]));
				
				i++;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		System.out.println(ts1);

	}
	

}

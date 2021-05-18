package ex06.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public HashSetEx1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set: 순서가 없고, 중복허용 x
		HashSet<Object> hs;
		hs= new HashSet<>();
		HashSet<Integer> ihs = new HashSet<Integer>();
		
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("b");
		System.out.println(hs.size());
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) { // if element has next el,
			System.out.println(it.next());//show elements
		}
		
		ihs.add(100);
		ihs.add(3);
		ihs.add(new Integer(2));
		//ihs.add("aaa");
		System.out.println("----------");
		for(Object i:ihs) {
			System.out.println(i);
		}
		Iterator ihs2 = ihs.iterator();
		while(ihs2.hasNext()) {
			System.out.println(ihs2.next());
			
		}
		
		

	}

}

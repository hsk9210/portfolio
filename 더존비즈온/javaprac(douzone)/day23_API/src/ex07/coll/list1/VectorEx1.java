package ex07.coll.list1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {

	public VectorEx1() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * List collection major methods
	 * boolean add(e)
	 * void add(int index, e)
	 * set(int index, e)
	 * boolean cotains(object o)
	 * e get(int index) 
	 * isEmpty()
	 * int size()
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector<>();
		System.out.println("length   /   capacity");
		System.out.println(v.size()+", "+v.capacity());
		v.add(2);
		v.add(3);
		v.add(30);
		v.add(new Integer(333)); v.add(30); v.add(30); v.add(30); v.add(30);
		System.out.println(v.size()+", "+v.capacity());
		v.add(30); v.add(30);
		System.out.println(v.size()+", "+v.capacity());
		v.add(40);
		System.out.println(v.size()+", "+v.capacity());
		System.out.println("1.iterator");
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+v.isEmpty());
		
		for(int j=0;j<v.size();j++) {
			System.out.print(v.get(j)+" ");
		}
		System.out.println();
		for(int j=0;j<v.size();j++) {
			Integer ii = (Integer) v.elementAt(j);
			System.out.print(ii+" ");
		}
		System.out.println();
		Collections.sort(v);
		for(int j=0;j<v.size();j++) {
			System.out.print(v.get(j)+" ");
		}
		System.out.println();
		v.trimToSize();
		System.out.println(v.size()+ " "+ v.capacity());
		System.out.println(v.remove(2));
		// Exception in thread "main" java.util.NoSuchElementException
		v.clear();
		System.out.println(v.firstElement());
		

	}

}

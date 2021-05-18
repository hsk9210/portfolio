package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedList {

	public IteratorLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 반복자 Iterator<E>
		 * 컬렉션 인터페이스를 구현하는 클래스들은 Iterator<E>인터페이스를
		 * 구현하는 인스턴스로 요소들을 참조한다.
		 * 반복자 인터페이스의 iterator()메소드를 이용해서 얻을 수 있다.
		 * 따라서 컬렉션 인터페이스를 구현하는 모든 컬렉션 클래스들은 iterator()
		 * 메소드를 이용해서 Iterator<E> 인터페이스를 구현하는 인스턴스를 구할 수 있다.
		 * 메소드:
		 * hasNext(): 참조할 수 있는 다음 요소에 따라 boolean 리턴.
		 * next() 다음 요소위치로 이동하고 요소의 데이터를 반환.
		 * remove(): 현재 위치의 요소 데이터를 삭제한다.
		 */
		LinkedList num = null;
		num = new LinkedList<Integer>();
		for(int i=0;i<5;i++) {
			num.add(i);
		}
		Iterator itr = num.iterator();
		while(itr.hasNext()) {
			Integer itg = (Integer)itr.next();
			System.out.println(itg);
		}
		
	}

}

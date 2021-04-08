package ex.linkedList;

import java.awt.DisplayMode;
import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * LinkedList는 내부적으로 연결 리스트를 사용.
		 * arrayList클래스가 가지는 저장 사이즈 증가 및 요소 삭제 시
		 * 시간이 오래 걸리는 단점을 보완하기 위해 만들어짐.
		 * 저장되는 요소는 비순차적으로 저장하고 이러한 요소들 사이를 
		 * 링크로 연결하여 구성된다. linkedList클래스도 List인터페이스를
		 * 구현하니 ArrayList클래스와 사용하는 메소드는 비슷하다.
		 */
		LinkedList<Integer> numbers = null;
		numbers =new LinkedList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(1);
		numbers.add(3);
		
		displayList(numbers);

	}
	
	/*
	 * arraylist, linkedlist 클래스 모두 List<E> 인터페이스를
	 * 상속하니 사용할 메소드는 같음.
	 * //그러나 인스턴스 내부적으로 저장 객체 요소를 저장하는 방법이 다르기 때문.
	 */
	static <E> void displayList(LinkedList<E> list) {
		// TODO Auto-generated method stub
		for(E player: list) {
			System.out.println(player);
		}
		
		
		
	}

}

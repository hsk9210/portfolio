package day24_API2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class stacker{
	Stack stack = new Stack<>();
}

public class Stack1 {

	public Stack1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack<>();
		stack.push(1);
		stack.push("a");
		stack.push(3.13);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		

	}

}


/*
		LinkedList<> a = new Queue<E>() {

			@Override
			public boolean addAll(Collection<? extends E> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<E> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(E e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E element() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean offer(E e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E peek() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public E poll() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public E remove() {
				// TODO Auto-generated method stub
				return null;
			}
		};


*/
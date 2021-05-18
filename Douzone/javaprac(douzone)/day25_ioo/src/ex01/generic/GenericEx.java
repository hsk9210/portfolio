package ex01.generic;

import java.util.Arrays;

public class GenericEx<T> {
	T[] t; //멤버변수

	public GenericEx() {
		// TODO Auto-generated constructor stub
	}

	public T[] getT() {
		return t;
	}

	public void setT(T[] t) {
		this.t = t;
	}

	
	public String display() {
		return "GenericEx [t=" + Arrays.toString(t) + "]";
	}
	

}

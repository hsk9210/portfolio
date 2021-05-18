package ex04.file;

import java.io.*;

public class RandomAccessFileEx {
	public static void main(String[] args) 
			throws  FileNotFoundException,  IOException {
		
		RandomAccessFile raf = new RandomAccessFile("example.txt", "rw"); // 예외발생
		
		for (int i = 0; i <= 10; i++) {
			raf.seek( i * 5 ); // 예외발생
			raf.writeInt(i);
		}
		
		System.out.println("성공!!!");
		raf.close();		
	}
}






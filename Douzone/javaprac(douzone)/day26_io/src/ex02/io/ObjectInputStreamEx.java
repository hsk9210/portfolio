package ex02.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException  {
		InputStream is = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Score s = (Score)ois.readObject();
		System.out.println("result output : " + s);
		ois.close();
	}
}







package ex02.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ObjectOutputStream {

	public ObjectOutputStream() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Score vo = new Score();
		
		vo.setScore(0);
		vo.setSubject("과목");
		
		vo.toString();
		System.out.println(vo);
		
		OutputStream os = new FileOutputStream("score.dat");
		ObjectOutputStream oos = new ObjectOutputStream();
	
		
		//oos.writeObject(vo);
		//oos.close();

	}

}

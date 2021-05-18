package ex02.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException {
		Score  vo = new Score();
//		vo.setSu(80);
//		vo.setSubject("미술");
		vo.setSu(90);
		vo.setSubject("전산");
		
		System.out.println(vo);
		
		OutputStream os = new FileOutputStream("score.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
		
	}
}






package ex01.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {

	public DataOutputStreamEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65); //'A' ascii
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.flush();//burrer 비우기
		
		System.out.println(dos.size());
		dos.close();
		

	}

}

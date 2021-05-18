package ex01.io;

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) 
					throws  FileNotFoundException, IOException {  // ����ó�� ����
		
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);  //  FileNotFoundException ���� �߻�
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);  // 'A' <--- ASCII code
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeFloat(8.8f);
		dos.writeDouble(12.34567);
		dos.flush();    // buffer ����
		
		System.out.println("test.txt ���Ͽ� " + dos.size() + "byte save");
		dos.close();
	}
}







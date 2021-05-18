package ex04.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
	public static void main(String[] args) throws IOException {
		//�о���� ������
		int seekSize = 5;
		//�б� �������� ���� ����
		RandomAccessFile raf = new RandomAccessFile("example.txt", "r");
		String line= "";
		
		//��ü ���ڿ��� ���
		while( (line = raf.readLine() ) != null ) {
			System.out.println(line);
		}
		
		//���ڿ� �� ����
		System.out.println("total length : " + raf.length() + "\n");
		
		byte[] data = null;
		long size = raf.length() / seekSize + (raf.length() % seekSize == 0 ? 0 : 1);
		
		for (int i = 0; i < size; i++) {
			data = new byte[seekSize];
			
			// seekSize ��ŭ ����
			raf.seek(i * seekSize);
			raf.read(data);
			
			// ����Ʈ �����͸� ���ڿ��� ��ȯ(trim() �� ����� ������ ����)
			System.out.printf("pointer : %02d   str : %s \n", raf.getFilePointer(), new String(data).trim());
		} // for end
		
		// ���� �ݱ�
		raf.close();
	}
}




















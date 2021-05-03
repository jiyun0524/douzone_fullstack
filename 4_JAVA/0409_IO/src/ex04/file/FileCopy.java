// �� �����ӵ��� !
package ex04.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		// �б� ��ü - FileInputStream
		InputStream is = new FileInputStream("cat.jpg");
		
		// ���� ��ü - FileOutputStrem
		OutputStream os = new FileOutputStream("copy.jpg");
		
		byte[] buffer = new byte[1024 * 8];
		
		// ���� �ð� ����
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		
		// ���� �ð� ����
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		is.close();
		os.close();
		System.out.println("copy success");
	}
}

/*
package ex04.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		// �б� ��ü - FileInputStream
		InputStream is = new FileInputStream("cat.jpg");
		
		// ���� ��ü - FileOutputStrem
		OutputStream os = new FileOutputStream("copy.jpg");
		
		// ���� �ð� ����
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		}
		
		// ���� �ð� ����
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		is.close();
		os.close();
		System.out.println("copy success");
	}
}
*/
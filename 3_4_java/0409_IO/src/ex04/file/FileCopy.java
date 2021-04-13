// 더 빠른속도로 !
package ex04.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("cat.jpg");
		
		// 쓰기 객체 - FileOutputStrem
		OutputStream os = new FileOutputStream("copy.jpg");
		
		byte[] buffer = new byte[1024 * 8];
		
		// 시작 시간 저장
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		
		// 끝난 시간 저장
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
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("cat.jpg");
		
		// 쓰기 객체 - FileOutputStrem
		OutputStream os = new FileOutputStream("copy.jpg");
		
		// 시작 시간 저장
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		}
		
		// 끝난 시간 저장
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		is.close();
		os.close();
		System.out.println("copy success");
	}
}
*/
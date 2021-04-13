package ex04.file;

import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		// 로컬 pc에 있는 파일 복사(읽어서) 후 붙여넣기(쓰기) => I/O
		File src = new File("C:\\Users\\JIYOON\\Desktop\\cat.jpg");
		File dist = new File("E:\\workspace\\0409_IO\\cat.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src); // 파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist); // 파일 출력 바이트 스트림 연결
			bis = new BufferedInputStream(fis); // 버퍼 입력 스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력 스트림 연결
			
			while((c=bis.read()) != -1) {// 더이상 읽어들일게 없을 때 까지
				bos.write((char)c);
			} // while end
			
			System.out.println("파일 복사 성공");
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}
		catch(Exception e) {
			System.out.println("파일 복사 중 오류발생");
		}
	}
}

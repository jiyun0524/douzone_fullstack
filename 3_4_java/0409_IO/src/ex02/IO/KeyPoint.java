package ex02.IO;

import java.io.InputStream;

public class KeyPoint {
	public static void main(String[] args) {
		InputStream is = System.in; // 표준입력

		try {
			System.out.println("단일 문자 입력 요망");
//			int num = is.read(); => 예외 발생함 '0'~'9':48~57 (아스키코드)
			int num = is.read() - 48; 
			
			// 문자 발생처리 - 자바에서 문자는 2바이트 처리됨
			is.read();
			is.read();
			
			int num2 = is.read() - 48;
			System.out.println(num + num2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package ex04.file;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
//			OutputStream os = new FileOutputStream("memo.txt"); // 상대
			OutputStream os = new FileOutputStream("E:\\workspace\\0409_IO\\memo.txt"); // 절대

			while (true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() + "\n\n";

				// 대 소문자 구별하지 않기 위해서
				if (str.toUpperCase().equals("exit"))
					break;

				os.write(str.getBytes()); // 읽어들인 문자 str의 길이 (getBytes())만큼 써주세요
//				System.out.println(str); // 화면출력

				// 읽어들인 문자 str의 길이 getBytes()인 만큼 써라
			} // while end
			System.out.println("test.txt save success !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

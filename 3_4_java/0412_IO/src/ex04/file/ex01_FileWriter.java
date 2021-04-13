package ex04.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class ex01_FileWriter {
	public static void main(String[] args) 
			throws IOException {
		String str, file;
		Date date = new Date();
		str = "파일 생성 시간 \n\n" + date + "\n\n";
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("파일 이름 : ");
		file = br.readLine();
		System.out.println("저장할 내용 : ");
		str += br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		System.out.println(file + " 파일 저장 성공 !");
	}
}

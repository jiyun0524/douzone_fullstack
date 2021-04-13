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
		str = "���� ���� �ð� \n\n" + date + "\n\n";
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("���� �̸� : ");
		file = br.readLine();
		System.out.println("������ ���� : ");
		str += br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		System.out.println(file + " ���� ���� ���� !");
	}
}

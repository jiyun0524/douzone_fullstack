package ex04.file;

import java.io.*;

public class ex02_FileReader {
	public static void main(String[] args) 
			throws Exception {
		int i = 0;
		String file;
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("���� ���� �� : ");
		file = br.readLine();

		System.out.println(file + "������ ���� -----");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);

		while ((i = reader.read()) != -1) {
			System.out.print((char) i + " ");
			if (fr.equals("\n"))
				System.out.println();
		}
	}
}

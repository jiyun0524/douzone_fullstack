package ex03.IO;

import java.io.*;

public class ex01_BufferReader {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("character input = ");
		String str = br.readLine(); // ���ܹ߻�. �������� ������ �Է¹ޱ�
		String str2 = br.readLine();
		int su1 = Integer.parseInt(str);
		int su2 = Integer.parseInt(str2);
		
		System.out.println(str + str2);
		System.out.println(su1 + su2);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
}

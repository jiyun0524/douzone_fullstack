package ex04.file;

import java.io.*;
import java.util.Date;

public class FileInformation {
	public static void main(String[] args) {
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.println("���ϸ� : "); // memo �� �� -->�����
//		E:\workspace\0409_IO\memo.txt --> ������
		try {
			System.in.read(fileName);
			strName = new String(fileName).trim();
			file = new File(strName);
			
			System.out.println("������ : " + file.getAbsolutePath());
			System.out.println("ǥ�ذ�� : " + file.getCanonicalPath());
			System.out.println("���������� : " + new Date(file.lastModified()));
			System.out.println("����ũ�� : " + file.length());
			System.out.println("�б�Ӽ� : " + file.canRead());
			System.out.println("����Ӽ� : " + file.canWrite());
			System.out.println("���ϰ�� : " + file.getPath());
			System.out.println("����Ӽ� : " + file.isHidden());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

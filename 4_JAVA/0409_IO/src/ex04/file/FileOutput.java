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
//			OutputStream os = new FileOutputStream("memo.txt"); // ���
			OutputStream os = new FileOutputStream("E:\\workspace\\0409_IO\\memo.txt"); // ����

			while (true) {
				System.out.println("���ڿ� �Է� ��� : ");
				String str = sc.nextLine() + "\n\n";

				// �� �ҹ��� �������� �ʱ� ���ؼ�
				if (str.toUpperCase().equals("exit"))
					break;

				os.write(str.getBytes()); // �о���� ���� str�� ���� (getBytes())��ŭ ���ּ���
//				System.out.println(str); // ȭ�����

				// �о���� ���� str�� ���� getBytes()�� ��ŭ ���
			} // while end
			System.out.println("test.txt save success !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

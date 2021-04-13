package ex03.IO;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileObjectLoad2 {
	public static void main(String[] args) throws Exception {
		String name = null;
		String position = null;
		String part = null;
		boolean flag = true;

		File f = new File("sawon.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;

		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);

			System.out.println("    >> ��� ���� << \n");
			System.out.println("�̸� \t ���� \t �μ�");

			while (flag) {
				name = (String) bis.readObject();
				position = (String) bis.readObject();
				part = (String) bis.readObject();
				System.out.print(name + "\t" + position + "\t" + part + "\t");
				System.out.println();
			}

		} catch (EOFException e) {
			// ������ ���� �����ϸ� EOFException�� �߻�.
			// �� ���ܸ� ó�����ָ� ���������� ó���˴ϴ�!
			System.out.println();
			System.out.println("Success Load File!");
		} finally {
			bis.close();
		} // try end
	}
}

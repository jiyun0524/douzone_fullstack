package ex03.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FileObjectSave2 {
	public static void main(String[] args) throws IOException {
		// 이름 직급 부서
		String name = null;
		String position = null;
		String part = null;
		boolean flag = true;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		File f = new File("sawon.txt");

		try {
			FileOutputStream fos = new FileOutputStream(f, true);  // append mode
			oos = new ObjectOutputStream(fos);

			while (flag) {
				System.out.println("----------------사원 정보 입력 하기 ----------------------");
				System.out.print("이름 >> ");
				name = br.readLine();
				System.out.print("직급 >> ");
				position = br.readLine();
				System.out.print("부서 >> ");
				part = br.readLine();

				oos.writeObject(name);
				oos.writeObject(position);
				oos.writeObject(part);

				System.out.print("More Input? Y or N >> ");

				if (br.readLine().equalsIgnoreCase("N")) {
					flag = false;
				}
			} // while end

			System.out.println("sawon.txt  save!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		} // try end
	}
}

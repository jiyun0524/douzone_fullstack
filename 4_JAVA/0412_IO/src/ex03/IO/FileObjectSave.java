package ex03.IO;

import java.io.*;

public class FileObjectSave {
	public static void main(String[] args) 
			throws Exception{
		String name, id, pw, phone, tmp;
		name = id = pw = phone = tmp = null;
		boolean gender = true;
		int age = 0;
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
//		이거 한번에 쓰기
		BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
		File f = new File("member.txt");
		
//		append mode
		FileOutputStream fos = new FileOutputStream(f, true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("-------- insert info ---------");
		System.out.println("name >> ");
		name = br.readLine();
		
		System.out.println("id >> ");
		id = br.readLine();
		
		System.out.println("password >> ");
		pw = br.readLine();
		
		System.out.println("M/F >> ");
		tmp = br.readLine();
		if(tmp.toLowerCase().equals("m")) gender = true;
		else gender = false;
		
		System.out.println("age >> ");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("phone >> ");
		phone = br.readLine();
		
		oos.writeObject(name);
		oos.writeObject(id);
		oos.writeObject(pw);
		oos.writeObject(gender);
		oos.writeObject(age);
		oos.writeObject(phone);
		
		System.out.println("members.txt save !");
	}
}
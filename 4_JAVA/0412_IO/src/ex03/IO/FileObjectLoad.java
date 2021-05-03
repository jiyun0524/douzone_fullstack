package ex03.IO;

import java.io.*;

public class FileObjectLoad {
	public static void main(String[] args) 
			throws Exception{
		String name, id, pw, phone, tmp;
		name = id = pw = phone = tmp = null;
		boolean gender = true;
		int age = 0;
		
		File f = new File("member.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream bis = new ObjectInputStream(fis);
		
//		각 변수에 맞게 형변환
		name = (String)bis.readObject();
		id = (String)bis.readObject();
		pw = (String)bis.readObject();
		gender = (Boolean)bis.readObject();
		age = (Integer)bis.readObject();
		phone = (String)bis.readObject();
		
		System.out.println(">> show info <<");
		System.out.println("name   | " + name);
		System.out.println("id     | " + id);
		System.out.println("pw     | " + pw);
		System.out.print("gender | ");
		if (gender == true) System.out.println("M");
		else System.out.println("F");
		System.out.println("age    | " + age);
		System.out.println("phone  | " + phone);	
		
		System.out.println("file load success !");
	}
}

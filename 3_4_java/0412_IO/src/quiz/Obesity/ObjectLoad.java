package quiz.Obesity;

import java.io.*;

public class ObjectLoad {
	public static void main(String[] args) 
			throws Exception {
		String name, bname;
		name = bname = null;
		Double height, weight, bmi;
		
		File f = new File("obesity_cal.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream bis = new ObjectInputStream(fis);
		
		name = (String)bis.readObject();
		height = (Double)bis.readObject();
		weight = (Double)bis.readObject();
		bmi = weight / ((height/100)*(height/100));
		
		System.out.println(">> show info <<");
		System.out.println("name   | " + name);
		System.out.println("weight | " + weight);
		System.out.println("height | " + height);
		System.out.println("\nyour obesity is");
		System.out.print("bmi    | ");
		System.out.println(bmi);	
		System.out.print("bname  | ");
		if(bmi<18.5) System.out.println("체중미달");
		else if(bmi<22.9) System.out.println("정상");
		else if(bmi<24.9) System.out.println("과체중");
		else System.out.println("비만");
	}
}

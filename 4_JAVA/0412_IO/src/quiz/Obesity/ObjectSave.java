package quiz.Obesity;

import java.io.*;

// Q1. �񸸵� ���� ���α׷� �ۼ��ϱ�
// 	   �߰�, ����, ���, ���� ó��
//     �̸� ������ Ű �ʿ�
public class ObjectSave {
	public static void main(String[] args) throws Exception {
		String name, tmp;
		name = tmp = null;
		Double height, weight;
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		File f = new File("obesity_cal.txt");
		
		FileOutputStream fos = new FileOutputStream(f, true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println(" >> insert info <<");
		System.out.println("name >> ");
		name = br.readLine();
		
		System.out.println("height(cm) >> ");
		height = Double.parseDouble(br.readLine());
		
		System.out.println("weight(kg) >> ");
		weight = Double.parseDouble(br.readLine());
		
		oos.writeObject(name);
		oos.writeObject(height);
		oos.writeObject(weight);
		
		System.out.println("obesity_cal.txt is save !");
	}
}

package quiz;

import java.util.HashMap;
import java.util.Set;

public class VideoManager extends Video {  // controller
	
		static HashMap<String, Video> map = new HashMap<String, Video>();
		
		static int top = 0;
		//�߰�/ ��� / ���� / ���� / ����
		public static void insert() {
			System.out.print("���� ������ �Է� �ϼ��� : ");
			String title = sc.next();
			System.out.print("�帣�� �Է� �ϼ��� : ");
			String category = sc.next();
			map.put(title, new Video(title, category));
			top++;  //  ���� ���� ó�� ���� 
		} // insert() end
		
		public static void print() {
			System.out.println("�����ϰ� �ִ� ���� ���� : " + top);
			System.out.println("���� ���� ---- �帣 ---- �뿩���� ---- �뿩�� ---- �뿩��¥");
			Set<String> set = map.keySet();
			
			for(String video : set ) {
				String title = map.get(video).title;
				String category = map.get(video).category;
				String lend = map.get(video).lend;
				if( lend.equalsIgnoreCase("y")) {
					lend = "�뿩";
				} else {
					lend = "�뿩����";
				} // if end
				
				String lendName = map.get(video).lendName;
				if( lendName == null ) lendName = "���� ����";
				
				String lendDate = map.get(video).lendDate;
				if( lendDate == null ) lendDate = "���� ����";
				
				System.out.println(title + "\t" + category + "\t" + lend 
																+ "\t" + lendName + "\t" + lendDate );
			} // for end
		} // print() end
		
		public static void modify() {
			System.out.print("�����Ͻ� ���� ������ �Է��ϼ��� : ");
			String title = sc.next();
			String category = map.get(title).category;
			
			if( map.containsKey(title) ) {
				map.put(title, new Video(title, category));
				System.out.println("����Ǿ����ϴ�.");
			} else {
				System.out.println("���� ������ �߸� �Է� �ϼ̽��ϴ�. �ش� ������ �����ϴ�. ");
			} // if end
		} // modify() end
		
		public static void delete() {
			System.out.print("�����Ͻ� ���� ������ �Է� ���ּ���. : ");
			String title = sc.next();
			if( map.containsKey(title)) {
				map.remove(title);
				System.out.println("���� �Ǿ����ϴ�.");
				top--;
			} else {
				System.out.println("���� ������ �߸� �Է� �ϼ̽��ϴ�. �ش� ������ �����ϴ�. ");
			}
		}
}






package quiz.Q3_Video;

import java.util.*;

public class VideoStore extends Video {
	ArrayList<Video> vlist = new ArrayList<Video>();
	
	VideoStore() { }
	VideoStore(String title, String category, String lend, 
			String lendName, String lendDate) {
		Video v = new Video(title, category, lend, lendName, lendDate);
		vlist.add(v);
	}
	
	// ���� �߰�
	public void VideoAdd(String title, String category, String lend, 
			String lendName, String lendDate) {
		Video v = new Video(title, category, lend, lendName, lendDate);
		vlist.add(v);
	}
	
	// ���� ����
	public void VideoDel(int i) {
		System.out.println("\n--- ������ �� ---");
		vlist.get(i-1).display();
		vlist.remove(i-1);
	}
	
	// ���� ����
	public void VideoAlt(int i, String title, String category, String lend, 
			String lendName, String lendDate) {
		Video v = new Video(title, category, lend, lendName, lendDate);
		vlist.set(i-1, v);
	}
	
	// ���� ���
	public void VideoList( ) {
		System.out.println("\n--- ���� ��� ---");
		for(int i=0; i<vlist.size(); i++) {
			System.out.println("- " + (i+1) + "�� -");
			vlist.get(i).display();
		}		
	}
}

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
	
	// 비디오 추가
	public void VideoAdd(String title, String category, String lend, 
			String lendName, String lendDate) {
		Video v = new Video(title, category, lend, lendName, lendDate);
		vlist.add(v);
	}
	
	// 비디오 삭제
	public void VideoDel(int i) {
		System.out.println("\n--- 삭제된 고객 ---");
		vlist.get(i-1).display();
		vlist.remove(i-1);
	}
	
	// 비디오 수정
	public void VideoAlt(int i, String title, String category, String lend, 
			String lendName, String lendDate) {
		Video v = new Video(title, category, lend, lendName, lendDate);
		vlist.set(i-1, v);
	}
	
	// 비디오 목록
	public void VideoList( ) {
		System.out.println("\n--- 비디오 목록 ---");
		for(int i=0; i<vlist.size(); i++) {
			System.out.println("- " + (i+1) + "번 -");
			vlist.get(i).display();
		}		
	}
}

package ex02.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainEntry {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setTitle("First Name");
		f.setBackground(Color.orange);
		f.setBounds(500, 350, 500, 300); // 위치, 크기
		f.setVisible(true);
		
//		익명(무명) 클래스 - 닫기 이벤트 처리
		f.addWindowListener(new WindowAdapter() {
			
//			닫기를 눌러서 끄기(디버깅종료 말고)
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

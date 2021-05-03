package ex01.inner;

// 강사님은 InnerMain 파일에 토글로 하심

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain2 {
//	이거를 27라인의 한줄로 퉁침
//	class EventHandler implements ActionListener {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("action event call !");
//		}
//	}
	
	public static void main(String[] args) {
		// ctrl + shift + o : 자동으로 임포트
		Frame frame = new Frame("event - inner");
		Button btn = new Button("btn_start");
		
		// button event
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("action occur");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
			}
		});
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setLocation(700, 350);
	}
}

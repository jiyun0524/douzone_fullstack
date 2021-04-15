package ex01.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain {
	class EventHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("action event call !");
		}
	}
	
	public static void main(String[] args) {
		// ctrl + shift + o : 자동으로 임포트
		Frame frame = new Frame("event - inner");
		Button btn = new Button("btn_start");
		
		EventHandler handler = new InnerMain().new EventHandler();
		// button event
		btn.addActionListener(handler);
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setLocation(700, 350);
	}
}

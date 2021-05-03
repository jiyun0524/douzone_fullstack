package ex01.inner;

// ������� InnerMain ���Ͽ� ��۷� �Ͻ�

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain2 {
//	�̰Ÿ� 27������ ���ٷ� ��ħ
//	class EventHandler implements ActionListener {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("action event call !");
//		}
//	}
	
	public static void main(String[] args) {
		// ctrl + shift + o : �ڵ����� ����Ʈ
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

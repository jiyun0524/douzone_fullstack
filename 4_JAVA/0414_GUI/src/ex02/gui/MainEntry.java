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
		f.setBounds(500, 350, 500, 300); // ��ġ, ũ��
		f.setVisible(true);
		
//		�͸�(����) Ŭ���� - �ݱ� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter() {
			
//			�ݱ⸦ ������ ����(��������� ����)
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

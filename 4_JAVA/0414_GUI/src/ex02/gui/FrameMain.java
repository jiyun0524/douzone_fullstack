package ex02.gui;

import java.awt.*;
import java.awt.event.*;

public class FrameMain extends Frame {
	TextArea ta;  //����
	Button btn;
	
	public FrameMain(String str) {
		super(str);
		setBounds(350, 200, 400, 300);
		setVisible(true);
		btn = new Button("Button1");
		ta = new TextArea("������ ��������", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		this.add(ta);
//		this.add(btn);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
//		FrameMain fm = new FrameMain("��â ����");
		new FrameMain("��â ����");
		
	}
}

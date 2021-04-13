package ex02.Thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JFrame;

// UI�� ���� ���� JFrame�� ��� ����
public class GraphicThread extends JFrame implements Runnable {
	
	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) {
		// ������ �Լ� - �ʱ�ȭ
		this.num = num;
		color = Color.orange;
		random = new Random();
		
		// ������(ȭ��) ũ�� - �ʺ�,����
		setSize(500, 400);
		// ȭ�麸���ֱ�
		setVisible(true);
		// ��ġ �����ϱ�
		setLocation(700, 200);
		
		// �ݱ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for(int i=0; i<num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint(); // paint �޼ҵ带 ��� �θ�
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 20, 20);
	}
	
	public static void main(String[] args) {
		// 1.
//		GraphicThread gframe = new GraphicThread(2000);
//		Thread t1 = new Thread(gframe);
//		t1.start();
		
		// 2.
		new Thread(new GraphicThread(3000)).start();
	}
}

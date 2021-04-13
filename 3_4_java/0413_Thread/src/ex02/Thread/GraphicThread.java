package ex02.Thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JFrame;

// UI를 갖기 위해 JFrame을 상속 받음
public class GraphicThread extends JFrame implements Runnable {
	
	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) {
		// 생성자 함수 - 초기화
		this.num = num;
		color = Color.orange;
		random = new Random();
		
		// 프레임(화면) 크기 - 너비,높이
		setSize(500, 400);
		// 화면보여주기
		setVisible(true);
		// 위치 조정하기
		setLocation(700, 200);
		
		// 닫기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for(int i=0; i<num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint(); // paint 메소드를 계속 부름
			
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

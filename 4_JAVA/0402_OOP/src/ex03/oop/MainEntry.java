package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setChannel(1);
		tv.setColor("�Ķ�");		
		tv.display();
		
		tv.setChannel(2);
		tv.setColor("�ʷ�");
		tv.display();
	}
}

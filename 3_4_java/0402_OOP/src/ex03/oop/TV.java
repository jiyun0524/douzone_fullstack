package ex03.oop;

public class TV {
	private int channel;
	private String color;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void display() {
//		System.out.println(this.channel + "ä���� "
//						+ this.color + "�� �Դϴ�");
		System.out.println(channel + "ä���� "
						+ color + "�� �Դϴ�");
	}	
}

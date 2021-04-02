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
//		System.out.println(this.channel + "채널은 "
//						+ this.color + "색 입니다");
		System.out.println(channel + "채널은 "
						+ color + "색 입니다");
	}	
}

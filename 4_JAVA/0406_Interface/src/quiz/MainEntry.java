package quiz;

public class MainEntry {
	public static void main(String[] args) {
		// 자기자신
		Subway sw = new Subway();
		sw.stop("부산");
		// 부모
		Trans tr = new Subway();
		tr.stop("부산");
		
	}
}

package ex06.BreakContinue;

public class MainEntry {
	public static void main(String[] args) {
		for (int i=1; i <= 10; i++) {
			if(i == 7) break;
			System.out.println(i);
		// break는 7을 만나면 그냥 멈춤
		}
		
		System.out.println("=========");
		
		for (int i=1; i <= 10; i++) {
			if(i == 7) continue;
			System.out.println(i);
		// continue는 7을 빼고 8로 넘어가서 10 까지
		}
		
		for (int i=1; i<100; i++) {
			if(i%2==0) continue;
				System.out.println(i + "\t");
			
			if(i % 20 == 0) System.out.println();
		}
	}
}

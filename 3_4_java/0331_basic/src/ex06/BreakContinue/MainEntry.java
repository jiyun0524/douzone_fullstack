package ex06.BreakContinue;

public class MainEntry {
	public static void main(String[] args) {
		for (int i=1; i <= 10; i++) {
			if(i == 7) break;
			System.out.println(i);
		// break�� 7�� ������ �׳� ����
		}
		
		System.out.println("=========");
		
		for (int i=1; i <= 10; i++) {
			if(i == 7) continue;
			System.out.println(i);
		// continue�� 7�� ���� 8�� �Ѿ�� 10 ����
		}
		
		for (int i=1; i<100; i++) {
			if(i%2==0) continue;
				System.out.println(i + "\t");
			
			if(i % 20 == 0) System.out.println();
		}
	}
}

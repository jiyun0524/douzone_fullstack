package ex06.BreakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean flag = true;

		first: {
			second: {
				third: {
					int k = 100;
					System.out.println("Before the Break");
					if (flag) break second; 
					// break �ĺ���; �ĺ��� ��ġ���� Ż��
					System.out.println("this won't execute");
				} // end third
				System.out.println("th1 �츮�� ȭ����");
			} // end second
			System.out.println("this is after second block");
		} // end first
		System.out.println("����� ��� �� ���Դϴ�");
	}
}

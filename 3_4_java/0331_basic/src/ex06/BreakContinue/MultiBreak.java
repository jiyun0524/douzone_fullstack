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
					// break 식별자; 식별자 위치까지 탈출
					System.out.println("this won't execute");
				} // end third
				System.out.println("th1 우리반 화이팅");
			} // end second
			System.out.println("this is after second block");
		} // end first
		System.out.println("여기는 모든 블럭 밖입니다");
	}
}

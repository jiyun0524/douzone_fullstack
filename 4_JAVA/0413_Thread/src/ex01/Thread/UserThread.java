package ex01.Thread;

public class UserThread extends Thread {
	String name;
	
	public UserThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
//		스레드 실행 부 구현(구현부)
//		System.out.println(name);
		System.out.println("start() 메소드에 의해 "
						+ "run()이 유도된다(실행대기)");
		
		for(int i=1; i<=10; i++) {
			if(i==7) {
				try {
					sleep(500);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // for end
			System.out.println(i);
		}		
	}
}

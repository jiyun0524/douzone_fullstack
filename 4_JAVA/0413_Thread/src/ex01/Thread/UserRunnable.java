package ex01.Thread;

public class UserRunnable implements Runnable {
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			if(i==7) {
				try {
					Thread.sleep(500);
					System.out.println(name);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
		
		
		/*
		Runnable u1 = new UserRunnable("u1");
		Thread t1 = new Thread(u1);
		
		// 한방에 하는 법
		Thread t2 = new Thread(new UserRunnable("u2")); 
		Thread t3 = new Thread(new UserRunnable("u3"));
		
		t1.start();
		t2.start();
		t3.start();
		*/
	}
}

package ex01.Thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread();
		Thread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		// 이렇게 자기자신도 가능하다
		UserThread t4 = new UserThread("t4"); 
		
		t1.start(); // run() 유도한다
		t2.start();
		t3.start();
		
//		System.out.println(t1);
//		System.out.println(t1.toString());
	}
}
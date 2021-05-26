package ex01.di.annot;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	
	//@Autowired  // 1. 멤버필드에 설정 가능
	private Recorder recorder; //멤버변수

	@Autowired  // 2. setter method 설정 가능
	public void setRecorder(Recorder recorder) {  // DI
		this.recorder = recorder;
		System.out.println("222 setter method success!!");
	}
	
	// 3. 생성자 함수에 설정 가능
	
	//@Autowired  // 4. 일반 메소드에 설정 가능
	public void recorderMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("recorderMethod() autowired");
	}
	
	public Recorder getRecorder() {
		System.out.println("getRecorder() call~~");
		return recorder;
	}
	
	public void recorderMethodPrint() {
		System.out.println("method 주입 : " + this.recorder);
	}
	
	
	
}

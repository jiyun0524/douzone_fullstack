package ex02.IO;

import java.io.*;

public class Score {
	
	private String subject; // 과목
	private int su; // 점수
		
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	@Override
	public String toString() {
		return "Score [subject = " + subject + ", su = " + su + "]";
	}
}

package ex02.IO;

import java.io.*;

public class Score {
	
	private String subject; // ����
	private int su; // ����
		
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

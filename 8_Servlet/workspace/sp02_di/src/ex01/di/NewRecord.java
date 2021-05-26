package ex01.di;

public class NewRecord {  // DTO 
	
	private int kor;
	private int eng;
	private int math;
	private int com;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public NewRecord() {
		
	}
	public NewRecord(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	public int total() {
		return this.kor + this.eng + this.math;
	}
	
	public float avg() {
		return total() / 3.0f;		
	}	
}

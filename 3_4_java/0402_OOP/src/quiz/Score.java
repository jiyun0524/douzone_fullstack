package quiz;

import java.util.Scanner;

public class Score {
	private int kor, eng, com;
	private double avg;
	private char grade;
	
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
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void input() {
		do {
			System.out.print("국어 점수 : ");
			kor = new Scanner(System.in).nextInt();

			System.out.print("영어 점수 : ");
			eng = new Scanner(System.in).nextInt();

			System.out.print("전산 점수 : ");
			com = new Scanner(System.in).nextInt();
		} while ((kor < 0 || kor > 100) 
				&& (eng < 0 || eng > 100) 
				&& (com < 0 || com > 100));
	}
	public void grade() {
		avg = ((kor + eng + com) / 3.0);
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
	}
	public void display() {
		System.out.println("총 점수 : " + (kor + eng + com) + 
				" 평균 : " + avg + " 학점 : " + grade);
	}
}

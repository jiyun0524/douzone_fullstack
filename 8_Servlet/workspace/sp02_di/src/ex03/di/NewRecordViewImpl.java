package ex03.di;

import java.util.Scanner;

public class NewRecordViewImpl implements IRecordView {
	
	private NewRecordImpl record;
	
	// setter 로 주입 받기
	public void setRecord(NewRecordImpl record) {
		this.record = record;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor: ");
		record.setKor(sc.nextInt());
		
		System.out.print("eng: ");
		record.setEng(sc.nextInt());
		
		System.out.print("math: ");
		record.setMath(sc.nextInt());

	}

	@Override
	public void print() {
		System.out.printf("kor: %d\n", record.getKor());
		System.out.printf("eng: %d\n", record.getEng());
		System.out.printf("math: %d\n", record.getMath());
		System.out.printf("total: %d\n", record.total());
		System.out.printf("avg: %.2f\n", record.avg()); //
	}
}

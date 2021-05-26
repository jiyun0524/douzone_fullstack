package ex01.di;

public class NewRecordView {
	private NewRecord record;
	
	public NewRecordView(int kor, int eng, int math, int com) {
		record = new NewRecord(kor, eng, math, com);
	}
	
	public void print() {
		System.out.println(record.total() + " / " + record.avg());
	}
}

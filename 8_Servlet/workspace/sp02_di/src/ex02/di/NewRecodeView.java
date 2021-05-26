package ex02.di;

public class NewRecodeView {

	private NewRecode recode;
	
	//
	public NewRecodeView(NewRecode recode ) {
		this.recode = recode;
	}
	
	//	
	public void setRecode(NewRecode recode) {
		this.recode = recode;
	}



	public void print() {
		System.out.printf("kor: %d\n", recode.getKor());
		System.out.printf("eng: %d\n", recode.getEng());
		System.out.printf("math: %d\n", recode.getMath());
		System.out.printf("com: %d\n", recode.getCom());
		System.out.printf("total: %d\n", recode.total());
		System.out.printf("avg: %f\n", recode.avg()); //
	}
}

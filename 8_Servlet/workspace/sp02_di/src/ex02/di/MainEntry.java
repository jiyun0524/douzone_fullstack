package ex02.di;

public class MainEntry {
	public static void main(String[] args) {
		
		NewRecode recode = new NewRecode(30, 50, 77, 99);
		NewRecodeView view = 
				new NewRecodeView(recode);
		
		view.setRecode(recode);
		view.print();
	}
}

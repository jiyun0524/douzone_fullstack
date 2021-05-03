package quiz.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		Trans tr = new Subway();
		tr.stop("∫ŒªÍ");
		tr = new Bus();
		tr.stop("πŒ∂Ù");
		tr = new Bicycle();
		tr.stop("±§æ»¥Î±≥");
		tr = new Airplane();
		tr.stop("¡¶¡÷");
	}
}

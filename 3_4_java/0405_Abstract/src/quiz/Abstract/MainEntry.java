package quiz.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		Trans tr = new Subway();
		tr.stop("�λ�");
		tr = new Bus();
		tr.stop("�ζ�");
		tr = new Bicycle();
		tr.stop("���ȴ뱳");
		tr = new Airplane();
		tr.stop("����");
	}
}

package quiz.Abstract;

public abstract class Trans {
	String result = "";
	public abstract String start(String start);
	public abstract void stop(String end);
	public void view() {
		System.out.println("super class shape");
	}
}
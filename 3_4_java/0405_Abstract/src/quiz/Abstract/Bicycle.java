package quiz.Abstract;

public class Bicycle extends Trans {
	String name = "자전거";
	
	@Override
	public String start(String start) {
		result = start + " 자전거길";
		return result;
	}

	@Override
	public void stop(String end) {
		start("수영교");
		System.out.println(name + "는 " + result + 
						"부터 " + end + " 자전거길 까지 운행");
	}
}

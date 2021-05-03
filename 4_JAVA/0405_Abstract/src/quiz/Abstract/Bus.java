package quiz.Abstract;

public class Bus extends Trans {
	String name = "버스";
	
	@Override
	public String start(String start) {
		result = start + "정류장";
		return result;
	}

	@Override
	public void stop(String end) {
		start("수영");
		System.out.println(name + "는 " + result + 
				"부터 " + end + "정류장 까지 운행");
	}
}

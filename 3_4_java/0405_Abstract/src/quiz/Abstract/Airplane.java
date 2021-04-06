package quiz.Abstract;

public class Airplane extends Trans {
	String name = "비행기";
	
	@Override
	public String start(String start) {
		result = start + " 공항";
		return result;
	}

	@Override
	public void stop(String end) {
		start("서울");
		System.out.println(name + "는 " + result + 
						"부터 " + end + " 공항 까지 운행");
	}

}

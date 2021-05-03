package quiz;

public class Subway implements Trans {
	String name = "지하철";
	String result = "";
	
	@Override
	public String start(String start) {
		result = start + "역";
		return result;
	}
		
	@Override
	public void stop(String end) {
		start("해운대");
		System.out.println(name + "은 " + result + 
						"부터 " + end + "역 까지 운행");
	}
}

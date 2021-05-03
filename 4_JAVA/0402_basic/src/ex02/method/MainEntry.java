package ex02.method;

// 매개변수(인자) 전달하기
public class MainEntry {
	public static void main(String[] args) { 
		
//		int hap = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
//		System.out.println(hap);
		
		if (args.length != 0) {
			double result = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
			
			System.out.println(result);
		}
		else {
		System.out.println("main argument input error!");
		System.exit(0);
		}
	}
}

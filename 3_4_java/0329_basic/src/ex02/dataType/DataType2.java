package ex02.dataType;

public class DataType2 {
	public static void main(String[] args) {
		short sh = 3; // -32768 ~ 32767 : 2byte
		int num = 50000;
		System.out.println("sh = " + sh);
		System.out.println("num = " + num);
		
		// 작은 자료형이 큰 자료형에 ~> 자동형변환(묵시적 변환)된다
		// num = sh;
		
		// 큰 자료형을 작은 자료형에 넣으려면 명시적으로 명시적 형변환 해야한다
		sh = (short)num; // short(2byte) = int(4byte)
		
		System.out.println("sh = " + sh);
		System.out.println("num = " + num);
		
		// 모든 자료형은 자신이 가진 크기를 벗어나지 않는다
		num = 32768;
		sh = (short) num;
		System.out.println("sh = " + sh);
		System.out.println("num = " + num);
	}
}

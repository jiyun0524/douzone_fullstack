package quiz;

// Q1. 정수 pay = 567890;
// 결과) 만원 : 56장, 천원 : 7장, 백원 : 8개, 십원 : 9개

public class ex1_operator {
	public static void main(String[] args) {
		int pay = 567890;
		
		System.out.print("만원 : " + pay/10000 + "장"
						+ "\n천원 : " + (pay%10000)/1000 + "장"
						+ "\n백원 : " + (pay%1000)/100 + "개"
						+ "\n십원 : " + (pay%100)/10 + "개");
	}
}

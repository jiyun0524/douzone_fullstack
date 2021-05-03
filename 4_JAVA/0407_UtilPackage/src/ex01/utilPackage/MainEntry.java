package ex01.utilPackage;

import java.util.*;

public class MainEntry {
	public static void main(String[] args) {
		// system이 갖고있는 날짜 얻어오기
		Calendar c = Calendar.getInstance();
		System.out.print("오늘의 날짜는 ");
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "월 ");
		// Month는 항상 0월 부터 시작해서 1을 더해줘야 함 
		System.out.print(c.get(Calendar.DATE) + "일 ");
		System.out.println("\n----------------------------");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		
		System.out.println("현재 시간은 " 
								+ h + "시 " + m + "분 " + s +"초");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2022, 12, 20, 0 ,0);
		
		if(c1.after(c2)) {
			System.out.println("현재 시간은 2022/01/01 이후");
		}
		else if(c1.before(c2)) {
			System.out.println("현재 시간은 2022/01/01 이전");
		}
		else if(c1.equals(c2)) {
			System.out.println("현재 시간은 2022/01/01 당일");
		}
	}
}

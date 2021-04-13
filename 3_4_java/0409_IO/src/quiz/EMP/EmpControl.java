package quiz.EMP;

import java.util.ArrayList;

public class EmpControl extends Emp {
	ArrayList<Emp> elist = new ArrayList<Emp>();
	
	EmpControl() {}
	EmpControl(String name, String dept, String position, 
			String pay, String phone) {
		Emp e = new Emp(name, dept, position, pay, phone);
		elist.add(e);
	}
	
	// 사원추가
	public void EmpAdd(String name, String phone, String dept, 
			String position, String pay) {
		Emp e = new Emp(name, dept, position, pay, phone);
		elist.add(e);
	}
	
	// 사원수정
	public void EmpAlt(int i, String name, String phone, String dept, 
			String position, String pay) {
		Emp e = new Emp(name, dept, position, pay, phone);
		elist.set(i-1, e);
	}
	
	// 사원삭제
	public void EmpDel(int i) {
		System.out.println("퇴사명단 -----");
		elist.get(i-1).display();
		elist.remove(i-1);
	}
	
	// 사원목록
	public void EmpList() {
		System.out.println("사원명단 -----");
		for (int i=0; i<elist.size(); i++) {
			System.out.println("- " + (i+1) + "번 - ");
			elist.get(i).display();
		}
	}
}

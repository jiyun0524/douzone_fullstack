package quiz.EMP;

import java.util.Scanner;

public class MainEntry {
	static String name, dept, position, pay, phone;
	
	public static void main(String[] args) {
		EmpControl ec = new EmpControl();
		
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("-------- 메뉴 --------"
								+ "\n1. 신입 사원 추가"
								+ "\n2. 사원 정보 수정"
								+ "\n3. 사원 정보 삭제"
								+ "\n4. 사원 목록 보기"
								+ "\n5. 종료"
								+ "\n----------------------"
								+ "\n >> ");
				int inNum = sc.nextInt();
				
				try {
					switch(inNum) {
					case 1:
						System.out.println("1. 신입 사원 추가 @@@");
						inEmp();
						ec.EmpAdd(name, phone, dept, position, pay);
						System.out.println("추가완료");
						break;
					case 2:
						System.out.println("2. 사원 정보 수정 @@@");
						ec.display();
						System.out.println("-----------------------"
								+ "\n수정할 사원 번호 입력 >> ");
						inNum = sc.nextInt();
						System.out.println("수정할 사원 정보 입력");
						inEmp();
					case 3:
						System.out.println("3. 사원 정보 삭제 @@@");
						ec.display();
						System.out.println("-----------------------"
								+ "\n삭제할 사원 번호 입력 >> ");
						inNum = sc.nextInt();						
						ec.EmpDel(inNum);
						break;
					case 4:
						System.out.println("4. 사원 목록 조회 @@@");
						ec.display();
						break;
					case 5:
						System.out.println("프로그램 종료");
						System.exit(0);
						break;
					default:
						System.out.println("err ! 잘못 입력했따 !");
					}
				}
				catch (Exception e) {
					System.out.println("err ! 그런사원은 없다 !");
				}
			}
		}
		catch(Exception e) {
			System.out.println("err ! 프로그램 종료 !");
		}
	}
	public static void inEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 | ");
		name = sc.next();
		System.out.println("부서 | ");
		dept = sc.next();
		System.out.println("직급 | ");
		position = sc.next();	
		System.out.println("연봉 | ");
		pay = sc.next();
		System.out.println("전화 | ");
		phone = sc.next();
	}
}

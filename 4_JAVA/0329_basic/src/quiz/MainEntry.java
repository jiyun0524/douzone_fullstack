package quiz;

// 자료형 이용해서 성적 처리 및 정보 출력
// 국어, 영어, 전산 점수 임의 적으로 부여하고 총점, 평균까지 출력
// 이름, 키(실수형), 몸무게(실수형)으로 정보 넣고 출력하는 프로그램 작성

public class MainEntry {
	public static void main(String[] args) {
		String name = "김또리";
		double height = 183.56;
		double weight = 78.1524;		
		
		int kor = 70;
		int eng = 90;
		int com = 88;
		
		int all_score = kor + eng + com;
		double avg_score = (kor + eng + com)/3;
		System.out.print("----------------------------\n");
		System.out.println(name + "학생의 인적사항"); 
		System.out.println("키 : " + height + "cm" + "\n몸무게 : " + weight + "kg");
		
		System.out.print("----------------------------\n");
		System.out.println(name + "학생의 기말고사 성적표");
		System.out.println("국어 : " + kor + "점" + "\n영어 : " + eng + "점\n전산 : " + com + "점");
		System.out.print("\n총 점 : " + all_score + "\n평균점수 : " + avg_score);
		System.out.print("\n----------------------------\n");
	}
}

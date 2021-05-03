package quiz.Q3_Video;

// Q2. Video class 
//     title 비디오제목
//     category 장르
//     lend 대여여부
//     lendName 대여자(고객명)
//     lendDate 대여일자(오늘날짜 입력하심 되요)

//     Video 추가 / 삭제 / Video 리스트 출력 
//     / 수정 / 프로그램 종료  출력하는 프로그램 작성하기.

public class Video {
	protected String title;
	protected String category;
	protected String lend;
	protected String lendName;
	protected String lendDate;
	
	Video () {}
	
	Video(String title, String category, String lend, 
			String lendName, String lendDate) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}
	
	public void display() {
		System.out.println("제목 : " + title);
		System.out.println("장르 : " + category);
		System.out.println("대여가능 : " + lend);
		System.out.println("대여자 : " + lendName);
		System.out.println("대여일 : " + lendDate);
		
	}
}

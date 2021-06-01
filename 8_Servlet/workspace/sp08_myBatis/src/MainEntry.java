import java.util.List;

import board.BoardVO;
import board.impl.BoardDAO;

public class MainEntry {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		
//		vo.setTitle("myBatis 제목");
//		vo.setWriter("강감찬");
//		vo.setContent("myBatis 내용입니다....");
//		dao.insertBoard(vo);
		
//		vo.setSearchCondition("title");
//		vo.setSearchKeyword("");
		
//		vo.setSearchCondition("title");
//		vo.setSearchKeyword("myBatis 제목");
		
		vo.setSearchCondition("writer");
		vo.setSearchKeyword("강감찬");
		
		List<BoardVO> boardList = dao.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " +board.toString());
		}
	}
}

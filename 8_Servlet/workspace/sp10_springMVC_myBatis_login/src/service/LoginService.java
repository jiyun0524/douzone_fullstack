package service;

import vo.UserMemberVO;

public interface LoginService {
	
	// 로그인 체크
	boolean loginCheck(UserMemberVO userMemberVO);
	
	// ID값 가져오기
	String getId(String id);
	
}

package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LoginDAO;
import dao.LoginDAO2;
import vo.UserMemberVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

//	@Autowired
//	LoginDAO loginDAO;	
	
	@Autowired
	LoginDAO2 loginDAO2;
	
	// loginCheck
	@Override
	public boolean loginCheck(UserMemberVO userMemberVO) {
		
		//int resultCnt = loginDAO.idCheck(userMemberVO);
		
		int resultCnt = loginDAO2.checkUser(userMemberVO); 
		if(resultCnt > 0) {
			return true;
		}
		return false;
	}
	
	// ID값 가져오기
	@Override
	public String getId(String id) {
		System.out.println("ser id : " + id);
		
//		String userId = loginDAO.getId(id);
		
		String userId = loginDAO2.getId(id);
		return userId;
	}
	
	


}

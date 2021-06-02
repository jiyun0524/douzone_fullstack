package dao;

import org.apache.ibatis.session.SqlSession;

import session.SqlSessionFactoryBean;
import vo.UserMemberVO;

public class LoginDAO2 {
	private SqlSession mybatis;
	
	public LoginDAO2() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public int checkUser(UserMemberVO vo) {
		int resultCnt = mybatis.selectOne("LoginDAO.checkUser",vo);
		return resultCnt;
	}

	public String getId(String id) {
		String userId = mybatis.selectOne("LoginDAO.getId",id);
		return userId;
	}
}

package kr.co.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject SqlSession sql;
	
	@Override
	public void register(MemberVO vo) throws Exception {
		sql.insert("memberMapper.register", vo);
	}
	
//	login에 파라미터 값이 전달되며 xml에서 조회한 데이터들은 MemberVO에 담김
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return sql.selectOne("memberMapper.login", vo);
	}
}

package kr.co.service;

import javax.inject.Inject;

import kr.co.dao.MemberDAO;
import kr.co.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDAO dao;
	
	@Override
	public void register(MemberVO vo) throws Exception {
		dao.register(vo);
	}
	
//	MemberDAO에서 MemberVO 안에 조회된 값들이 담김
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}
}

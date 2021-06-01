package kr.bit.main;

import org.apache.ibatis.session.SqlSession;

import kr.bit.dto.Emp;
import kr.bit.service.SqlMapClient;

public class MainEntry {
	public static void main(String[] args) {
		
		SqlSession sqlsession = SqlMapClient.getSqlSession();
		
		Emp emp = sqlsession.selectOne("EMP.selectById", "FORD");
		System.out.println("Single ROW 처리 하기");
		System.out.println("empno : " + emp.getEmpno() + " / " + "ename : " + emp.getEname());
		
	}
}
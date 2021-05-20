package edu.bit.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dbConn.util.ConnectionCloseHelper;


public class MemberDAO { // Controller

	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	private MemberDAO() { }  // useBean 태그로 객체 생성하면~
	
	public Connection getConnection() throws Exception {
		// 연결은 JNDI * Pool 형태로 연결 객체 생성해서 리턴할것
		Context initCtx = new InitialContext();
//		Context envCtx = (Context)initCtx.lookup("java:comp/env");
//		DataSource  ds = (DataSource)envCtx.lookup("jdbc:MemberDB");
	
		DataSource  ds = 
			(DataSource)initCtx.lookup("java:comp/env/jdbc:MemberDB");
		
		return ds.getConnection();
	}//getConnection() end
	
	//insert 처리 - 회원 가입 처리 메소드 (삽입)
	public void insert(MemberVO vo) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("insert into Members(id, passwd, name, jumin1,");
		sb.append("jumin2, email, blog, reg_date) ");
		sb.append(" values( ?, ?, ?, ?,?, ?, ?, ?)");
		
		conn = getConnection();
		pstmt = conn.prepareStatement(sb.toString());
		
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPasswd());
		pstmt.setString(3, vo.getName());
		pstmt.setString(4, vo.getJumin1());
		pstmt.setString(5, vo.getJumin2());
		pstmt.setString(6, vo.getEmail());
		pstmt.setString(7, vo.getBlog());
		pstmt.setTimestamp(8, vo.getReg_date());
		
		int result = pstmt.executeUpdate();
		//System.out.println("result : " + result);
		
		ConnectionCloseHelper.close(pstmt);
		ConnectionCloseHelper.close(conn);
	} // insert() end
	
	//회원 리스트 보기 - selectAll()
	public ArrayList<MemberVO> selectAll() throws Exception {
//		String sql = "select id, name, jumin1, jumin2, email, blog,"+
//				" reg_date from Members order by name desc";
		
		StringBuffer sb = new StringBuffer();
		sb.append("select id, name, jumin1, jumin2, email, blog,");
		sb.append("reg_date from Members order by name desc");
		
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery(sb.toString());
		
		MemberVO vo = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		while( rs.next() ) {
			vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setName(rs.getString("name"));
			vo.setJumin1(rs.getString("jumin1"));
			vo.setJumin2(rs.getString("jumin2"));
			vo.setEmail(rs.getString("email"));
			vo.setBlog(rs.getString("blog"));
			vo.setReg_date(rs.getTimestamp("reg_date"));
			
			list.add(vo);
		}// while end
		
		ConnectionCloseHelper.close(rs);   ConnectionCloseHelper.close(pstmt);
		
		return list;
	} // selectAll() end
	
	//confirmID(id) - 회원 가입시 id 중복 체크 할때 사용할 함수
	public int confirmID(String id) throws Exception {
		String sql = "select id from Members where id = ?";
		int result = -1;
		
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if( rs.next() ) result = 1;  //해당 아이디가 있다.
		else result = -1;  
		
		ConnectionCloseHelper.close(rs);  ConnectionCloseHelper.close(pstmt); ConnectionCloseHelper.close(conn);
				
		return result;
	} // confirmID(id) end
	
	//userCheck(id, pwd) - 로그인시 사용할 메소드 id/password 체크함
	public int userCheck(String id, String pwd) throws Exception {
		String sql = "select passwd from Members where id = ?";
		String dbpwd = "";
		int result = -1;
		
		//System.out.println(sql);
		
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if( rs.next() ) {  //id check
			dbpwd = rs.getString("passwd");
			if( dbpwd.equals(pwd)) result = 1;  //인증 성공
			else result = 0;  // 비번 틀림
			
		}else {
			result = -1;  //해당 아이디가 없음
		}//end if
		
		ConnectionCloseHelper.close(rs);  ConnectionCloseHelper.close(pstmt); ConnectionCloseHelper.close(conn);
		
		return result;
	} // userCheck() end
	
	// getMember(id) - update 시 입력된 데이터를 보여줄 때 사용할 함수
	public MemberVO getMember(String id) throws Exception {
		
		String sql = "select * from Members where id = ?";
		MemberVO vo = null;
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if( rs.next() ) {
			vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setName(rs.getString("name"));
			vo.setPasswd(rs.getString("passwd"));
			vo.setJumin1(rs.getString("jumin1"));
			vo.setJumin2(rs.getString("jumin2"));
			vo.setEmail(rs.getString("email"));
			vo.setBlog(rs.getString("blog"));
			vo.setReg_date(rs.getTimestamp("reg_date"));
			
		} //end if
		
		ConnectionCloseHelper.close(rs);  ConnectionCloseHelper.close(pstmt); ConnectionCloseHelper.close(conn);
		
		return vo;
	}// getMember(id) end
	
	//update(vo) - 회원 정보 수정 완료
	public void update(MemberVO vo) throws Exception {
		String sql = "update Members set passwd=?, name=?, email=?, blog=? where id = ?";
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getPasswd());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getEmail());
		pstmt.setString(4, vo.getBlog());
		pstmt.setString(5, vo.getId());
		
		pstmt.executeUpdate();
		ConnectionCloseHelper.close(pstmt); ConnectionCloseHelper.close(conn);
	}//update() end
}






















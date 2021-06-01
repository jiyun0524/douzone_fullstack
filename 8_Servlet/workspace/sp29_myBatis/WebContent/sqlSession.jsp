<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="kr.bit.dto.Emp, java.util.List, kr.bit.service.SqlMapClient" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>sqlSession 설정 파일 부르기</title>
</head>
<body>
	<%
	    SqlSession sqlsession = SqlMapClient.getSqlSession();
		Emp emp = sqlsession.selectOne("EMP.selectById", "SMITH");
		out.println("empno : " + emp.getEmpno() + " / " + "ename : " + emp.getEname());

		out.print("<br>Multi ROW 처리하기<br>");
		List<Emp> listEmp = sqlsession.selectList("EMP.selectAll");
		
		for(Emp e : listEmp) {
			out.println("empno : " + emp.getEmpno() + " / "
							+ "ename : " + emp.getEname() + "<br>" );
		}
		
		sqlsession.close();
	%>
</body>
</html>





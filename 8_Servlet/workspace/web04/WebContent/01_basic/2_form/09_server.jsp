<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="temp.*" %>
<%
		EmpVO vo = new EmpVO();
		// 1. 각 화면의 입력값을 얻어와서 VO 객체에 멤버로 지정
		
		
		
		// 2. 모델측 dao 클래스의 insert () 메소드로 전송
		EmpDao dao = EmpDao.getInstance();
		dao.insertEmp(vo);
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 사원등록 </title>
</head>
<body>
	 성공적으로 입력되었지 DB에서 확인합니다.
</body>
</html> --%>
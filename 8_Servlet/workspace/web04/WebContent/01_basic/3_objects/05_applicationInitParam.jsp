<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> application 초기 파라메터 읽기</title>
</head>
<body>

<h2>초기 파라메터 읽기</h2>
아이디 : 	<%= application.getInitParameter("DBUser") %><br/>
비밀번호 : <%= application.getInitParameter("DBPass") %> <br/>

</body>
</html>







<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>insert form ex</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pwd = request.getParameter("pw");
		
		out.print(id + "님의 암호는 " + pwd);
	%>
</body>
</html>
<%--
	<% jsp 시작태그
	%> jsp 종료태그
--%>
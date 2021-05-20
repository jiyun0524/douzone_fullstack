<!-- ex05_response.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>response objcet</title>
</head>
<body>
	일반 Response : <%= 100+200+300 %> <br />
	Redirect : <%
			//클라이언트 브라우저에게 ex01_jsp.jsp를 재요청 하도록 명령한다.
			out.print("어쩌구.....");
			response.sendRedirect("ex01_jsp.jsp");	
	%>
</body>
</html>
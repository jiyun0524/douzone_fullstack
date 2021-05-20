<%@ page contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%! String name; %>    
<% name = "홍길동"; %>
<!DOCTYPE html>
<html>
<head>
<title> JSP 기본 구성 예제</title>
</head>
<body>
	안녕하세요 <%= name %>님 
	
	<!--  HTML 주석 -->
	<%-- JSP 주석 --%>
	<% // JAVA 주석 %>
</body>
</html>



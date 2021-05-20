<!-- ex15_errorPage.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <!-- 해당 페이지에서 에러 발생시 이동할 에러 페이지 지정 -->
<%@ page errorPage="/Error/CommonError.jsp" %>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>Error Page Test</title>
</head>
<body>
	<!-- http://localhost:8080/day43_jsp/jsp/ex15_errorPage.jsp?name=kingsmile -->
 name 값 : <%= request.getParameter("name").toUpperCase() %>
</body>
</html>
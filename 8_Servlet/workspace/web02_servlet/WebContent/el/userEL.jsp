<%@page import="edu.el.Calculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> userEL.jsp </title>
</head>
<body>
	<h3>표현안에서 사용자가 만든 태그 라이브러리 사용하기</h3>
	<p>
	<form action="userEL.jsp" method="post">
		x : <input type="text" name="x" value="${param['x'] }">
		y : <input type="text" name="y" value="${param['y'] }">
		
		<input type="submit" value="더보기 눌러바" />
	</form>
	</p>
	<br><br><br>
	<p>
		<%-- <h3>합 : ${hap:add(param['x'],param['y'])} 입니다.</h3> --%>
		<h3><%= Calculator.add("3", "5") %></h3>
	</p>
</body>
</html>
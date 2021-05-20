<!-- ex06_buffer.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page buffer="1kb"  autoFlush="false" %>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>Buffer 사용하기</title>
</head>
<body>
<%
	//default : buffer size : 8Kb
	//default : autoFlush : true
	
	for(int i=0; i< 1000; i++){
%>
	Hello~~~~

<% } //for end %>
</body>
</html>














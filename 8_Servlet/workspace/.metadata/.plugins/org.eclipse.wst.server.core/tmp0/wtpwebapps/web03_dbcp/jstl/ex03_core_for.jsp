<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex03_core_for.jsp </title>
</head>
<body>
<%
	for(int i=0; i < 10; i++) {
		if( i % 2 == 1) { %>
			<b><%= i %></b> &nbsp;&nbsp;&nbsp;&nbsp;			
	<%	} }	%>
<hr>
<c:forEach begin="1" end="10" step="2" var="i">
	<b>${ i }</b>&nbsp;&nbsp;&nbsp;&nbsp;	
</c:forEach> <hr>

<h2>1~100 까지의 합을 구하세요.</h2>
<c:set var="sum" value="0" />
<c:forEach begin="1" end="100" var="i">
	<c:set var="sum" value="${sum + i }"/>
</c:forEach>

<font color="red">합은 : ${sum }</font> <hr> 
<h1> 구구단 </h1>
<c:forEach begin="1" end="9" var="i">
	<c:forEach begin="1" end="100" var="j">
		<%-- ${i} * ${j } = ${ i*j } <br> --%>
	</c:forEach>
</c:forEach> <hr>

<%
	String[] sports = {"축구", "야구", "농구", "골프", "수영", "볼링" };
	HashMap map = new HashMap();
	map.put("nicname", "kingsmile");
	map.put("age", 13);
	map.put("tel", "010-9872-0202");
	map.put("date", new Date());
%>

<h1>스포츠 배열2번째 값부터 3개만 출력</h1>

<%-- <c:set value="<% new String[]{"축구", "야구", "농구", "골프", "수영", "볼링", "발야구" } %>" var="sportArray" /> --%>
<c:set var="sports">{"축구", "야구", "농구", "골프", "수영", "볼링", "발야구" }</c:set>
${ sports } <br>

<c:set value="<%= sports %>" var="sportArray" />

<c:forEach var="i" items="${ sportArray }" begin="1" end="3" step="1" varStatus="status">
	i값 : ${ i } <br>
	루프 실행 현재 인덱스 값 : ${status.index}<br>
	루프 실행 횟수 : ${ status.count } <br>
	begin 값 : ${ status.begin } <br>
	end 값 : ${ status.end } <br>
	step 값 : ${ status.step } <br><br>

</c:forEach> <hr>

<c:set var="memberMap" value="<%= map %>" />
<c:forEach var="i" items="${ memberMap }">
	${i.key } : ${ i.value }<br>
</c:forEach><hr>

<%
	String a = "a, b, c, d, e, f, g, h, i, j";
	String[] alpahabet = a.split(",");
	for(int i=0; i< alpahabet.length; i++) {  %>
	
	<b><%= alpahabet[i] %></b> &nbsp;&nbsp;&nbsp;&nbsp;	 
		
<% } %>	<br><br>

<c:set var="data" value="을지문덕, 김유신, 강감찬, 세종대왕, 이순신" />
 
<c:forTokens items="${ data }" delims=","  var="varData">
	<b>${ varData }</b>
</c:forTokens><hr>

<p>Browser변수 값 설정</p>
<c:set var="browser" value="${ header['user-agent'] }"/>
<c:out value="${browser }"></c:out>
<c:remove var="browser"/>
<c:out value="${browser }"></c:out>
 
</body>
</html>
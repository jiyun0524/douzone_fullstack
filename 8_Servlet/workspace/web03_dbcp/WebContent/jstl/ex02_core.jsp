<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex02_core.jsp </title>
</head>
<body>
<c:set value="Hello JSTL!!" var="str" />
<h3>&lt;c:set&gt;사용 후 : <c:out value="${str }"/>  </h3>

<c:set value="yuna" var="name" />
<h3>내 이름은 : <c:out value="${name }"/>  </h3>

<c:set var="num">1000</c:set>
<c:out value="${ num }"/> 

<c:catch var="error">
	<%= 10/0 %>
</c:catch>
<h3>&lt;c:catch&gt;로 잡아낸 오류 : <c:out value="${ error }"/>  </h3>

name = <c:out value="${name }" default="무명씨야~~~" />
name2 = <c:out value="${name2 }" default="무명씨야~~~" />

<%
	String irum = "happy";
	pageContext.setAttribute("id", "kingsmile");
	session.setAttribute("pwd", "oracle");
	application.setAttribute("team", "우리팀");
	request.setAttribute("age", 3);
%>
<p>
irum = ${ irum} <br>
id = ${id }<br>
pwd= ${pwd } <br>
team=${team } <br>
age = ${ age }<br> <hr>

<c:out value="ID = ${id }"/> <br>
<c:out value="pwd = ${pwd }"/> <br>
<c:out value="age = ${age }"/> <br>
<c:out value="team = ${team }"/> <br><hr>

<c:if test="${ 5 > 10 }">
	<h3>5는 10보다 크지 않다.</h3>
</c:if>

<c:if test="${ 6+3 == 9 }"><h3> 6+3 == 9</h3></c:if>
<c:if test="${ 5+3 != 9 }"><h3> 5+3 != 9</h3></c:if> <hr>

<c:choose>
	<c:when test="${ 5+10 == 50 }"><h3>5+10 == 50</h3></c:when>
	<c:when test="${ 50+10 == 50 }"><h3>50+10 == 50</h3></c:when>
	<c:when test="${ 10+10 != 50 }"><h3>10+10 != 50</h3></c:when>
	<c:otherwise><h3>아무것도 조건에 맞는게 없습니다.</h3></c:otherwise>
</c:choose>
<hr>

문제] su = 30 을 넣고 짝수,홀수 판정 하는 프로그램 만들기 if이용 <br>
<c:if test="${ su % 2 == 0 }"><h3> ${ "even" }</h3></c:if>
<c:if test="${ su % 2 != 0 }"><h3>${ "odd" }</h3></c:if> <hr>

문제] num = 31 을 넣고 짝수,홀수 판정 하는 프로그램 만들기 choose이용 <br>
<c:choose>
	<c:when test="${ num % 2 == 0 }"><h3> ${ "choose - even" }</h3></c:when>
	<c:when test="${ num % 2 != 0  }"><h3>${ "choose - odd" }</h3></c:when>
	<c:otherwise><h3>정수가 아닙니다.</h3></c:otherwise>
</c:choose> <hr>


</body>
</html>











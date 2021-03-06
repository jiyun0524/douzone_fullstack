<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:requestEncoding  value="utf-8"/>

<fmt:setLocale value="kor"/>
					<!-- .properties 를 뺀 파일명만 기재 -->
<fmt:bundle basename="bundle.testBundle"> <!--  경로.파일명 -->

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex04_fmt.jsp </title>
</head>
<body>
	<fmt:message key="name"/>
	<fmt:message key="message" var="msg" />
	<c:out value="${msg}" />
</body>
</html>


</fmt:bundle>

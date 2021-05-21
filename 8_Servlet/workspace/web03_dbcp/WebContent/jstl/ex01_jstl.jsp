<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- <%@ page import="date.jsp"%> --%>

<c:import url="date.jsp" var="today" />

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex01_jstl.jsp - core </title>
</head>
<body>
${today } <br><hr>

파라미터 : <c:out value="${ param.id }"/><br>
 <c:out value="${ param['id'] }"/><br><br><br>


<form action="ex01_jstl.jsp" method="post">
	<input type="text" name="id">
	<input type="submit" value="확인">
</form>
</body>
</html>
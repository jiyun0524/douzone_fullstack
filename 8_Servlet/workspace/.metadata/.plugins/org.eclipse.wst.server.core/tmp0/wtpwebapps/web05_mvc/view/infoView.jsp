<!-- infoView.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> infoView.jsp </title>
</head>
<body>
 <h3>나의 정보를 알려줄게</h3>
 
 <hr>
 <c:set value="${ obj }"  var="x" />
 <c:out value="${ x }" />
</body>
</html>
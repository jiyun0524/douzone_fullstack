<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>@ModelAttribute 사용법</title>
</head>
<body>
	<h3>게임 키워드</h3>
	<ul>
		<c:forEach items="${queryList}" var="plist">
			<li>
				${plist}
			</li>
		</c:forEach>
	</ul>
	<hr>
	<select name="type">
		<c:forEach items="${searchTypeList}" var="searchtype">
			<option value="${searchtype.code}">
				${searchtype.text}
			</option>		
		</c:forEach>
	</select>
	
</body>
</html>
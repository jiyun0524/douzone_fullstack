<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h3>게시판 글쓰기 입력 폼</h3>  
	<!-- get방식 전송 들어왔을때 실행될 페이지 -->
	<form method="POST">
		<input type="hidden" name="parentId" value="0">
		제목:<input type="text" name="title"><br>
		내용:<input type="text" name="content"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>
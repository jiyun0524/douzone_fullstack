<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp basic</title>
</head>
<body>
	<h3>1~100까지 합을 구합니다.</h3>
	<%
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	%>

	<h2>
		sum =
		<%=sum%>
	</h2>
	<hr />

	<h2>구구단 출력 하기</h2>
	<%
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				out.print(j + "*" + i + "=" + (i * j) + "\t");
			} // j end
	%>
	<p>
		<%
			} // i end
		%>
	
</body>
</html>
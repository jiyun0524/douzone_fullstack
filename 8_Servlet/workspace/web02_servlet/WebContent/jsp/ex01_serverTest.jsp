<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Server Test</title>
</head>
<body>
	<h2>jsp는 HTML 코드안에 JAVA 코드가 들어간다</h2>
<%
	// post 방식으로 전송시 한글 깨짐 처리
	request.setCharacterEncoding("UTF-8");

	int su = 90;
	for(int i=0;i<10;i++) {
		out.print(i);
	}
	out.print("<br /> su = " + su + "<p />");
	int plus = add(1,2);
	out.print(plus);
	out.print("<p />");
	out.print(add(3,4));
%>

<!-- 자바, 변수선언, 제어문, 함수선언 ! -->
<%! 
	public int add(int x, int y) {
	return x+y;
}
%>

<%= "<h2>su = " + su + "</h2>" %>
<hr/>
<%= "문장 출력 가능합니다. 1234~ " %> <p />
<%= add(10,20) %>
</body>
</html>
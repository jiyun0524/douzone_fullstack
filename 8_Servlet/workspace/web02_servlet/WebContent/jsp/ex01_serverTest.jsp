<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Server Test</title>
</head>
<body>
	<h2>jsp�� HTML �ڵ�ȿ� JAVA �ڵ尡 ����</h2>
<%
	// post ������� ���۽� �ѱ� ���� ó��
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

<!-- �ڹ�, ��������, ���, �Լ����� ! -->
<%! 
	public int add(int x, int y) {
	return x+y;
}
%>

<%= "<h2>su = " + su + "</h2>" %>
<hr/>
<%= "���� ��� �����մϴ�. 1234~ " %> <p />
<%= add(10,20) %>
</body>
</html>
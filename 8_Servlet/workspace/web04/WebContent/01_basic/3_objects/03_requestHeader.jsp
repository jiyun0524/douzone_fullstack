<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.util.Enumeration" %>
<html>
<head><title>헤더 목록 출력</title></head>

<!-- request객체의 역할 : (3) 요청 헤더의 정보 얻어오기 -->

<body>
<%
	Enumeration<String> elem = request.getHeaderNames();
	while(elem.hasMoreElements()) {
		String headerName = (String)elem.nextElement();
		String headerValue = request.getHeader(headerName);
%>
<%= headerName %> = <%= headerValue %> <br>
<%
	}
%>

</body>
</html>

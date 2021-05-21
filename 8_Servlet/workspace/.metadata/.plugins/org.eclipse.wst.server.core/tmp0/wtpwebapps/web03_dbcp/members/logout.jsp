<!-- logout.jsp -->
<%
	session.invalidate();
	response.sendRedirect("main.jsp");
%>
<!-- modifyPro.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="edu.bit.members.*" %>
<%@ include file="../view/color.jsp" %>

<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="vo" class="edu.bit.members.MemberVO" >
	<jsp:setProperty name="vo"  property="*" />
</jsp:useBean>

<%
	String id = (String)session.getAttribute("memID");
	vo.setId(id);
	
	MemberDAO.getInstance().update(vo);

	/* MemberDAO dao = MemberDAO.getInstance();
	dao.update(vo); */
%>

<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>회원 정보 수정하기</title>
</head>
<link href="mystyle.css" rel="stylesheet" type="text/css" >
<body>
<table width="270" border="0" cellpadding="5" align="center">
	<tr bgcolor="<%= title_c %>">
		<td height="39" align="center">
			<font size="2"><b>회원 정보가 수정 되었습니다.</b></font>
		</td>
	</tr>
	
	<tr>
		<td bgcolor="<%=value_c %>">
			<p> 입력하신 내용이 수정 완료 되었습니다.</p>
		</td>
	</tr>
	
	<tr>
		<td bgcolor="<%=value_c %>" align="center">
			<form>
				<input type="button" value="메인으로" onclick="window.location='main.jsp'">
			</form>
			5초 후에 메인으로 이동합니다.
			<meta http-equiv="Refresh"  content="5; url=main.jsp">
		</td>
	</tr>
</table>
</body>
</html>


















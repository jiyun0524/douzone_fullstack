<!-- memberList.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../view/color.jsp"%>
<%@page import="java.util.*, java.sql.*, edu.bit.members.*" %>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>회원 리스트 보기</title>
</head>
<link href="/view/mystyle.css" rel="stylesheet" type="text/css">
<body>

<table  border="1" cellspacing="0" cellpadding="5">
	<tr>
		<td bgcolor="<%=title_c%>">ID</td>
		<td bgcolor="<%=title_c%>">회원명</td>
		<td bgcolor="<%=title_c%>">생년월일</td>
		<td bgcolor="<%=title_c%>">이메일</td>
		<td bgcolor="<%=title_c%>">블로그</td>
		<td bgcolor="<%=title_c%>">가입일자</td>
	</tr>
	<%
		ArrayList<MemberVO> list = MemberDAO.getInstance().selectAll();
		
		MemberVO vo = null;
		
		for(int i=0; i < list.size(); i++) {
			vo = (MemberVO)list.get(i);
			
			String id = vo.getId();
			String name = vo.getName();
			String jumin1 = vo.getJumin1();
			String jumin2 = vo.getJumin2();
			String email = vo.getEmail();
			String blog = vo.getBlog();
			Timestamp reg_date = vo.getReg_date();
	%>
	<tr>
		<td><%= id %></td>
		<td><%= name %></td>
		<td><%= jumin1 %></td>
		<td><%= email %></td>
		<td><%= blog %></td>
		<td><%= reg_date %></td>
	</tr>
	<%}//for end%>
	<tr>
		<td colspan="6">
			<input type="button" value="메인으로"
			 onclick="window.location='main.jsp'">
			 <input type="button"  value="회원가입" onclick="javascript:window.location='insertForm.jsp'">
		</td>
	</tr>

</table>

</body>
</html>










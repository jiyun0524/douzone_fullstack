<!-- ex21_cookie.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>Cookie</title>
</head>
<body>

 <%
 	Cookie cookie = new Cookie("newName", "jiyoon");
 	//cookie.setMaxAge(0);  //사용 기간을 0으로 만들면 <--- 소멸
 	cookie.setMaxAge(60); // 60초, 30일(30*24*60*60) 일*시*분*초
 	//Client 브라우저에게 Cookie 전달
 	response.addCookie(cookie); 
 %><hr>
 서버 도메인 이름 : <%= cookie.getDomain() %><br>
 서버에서 설정 이름 : <%= cookie.getName() %><br>
 서버에서 설정 값 :  <%= cookie.getValue() %><br>
<hr>
<%
	//Client 쿠키 정보 읽어오기
	Cookie[] cs = request.getCookies();
	if( cs != null || cs.length > 0 ){
		
		for(int i =0; i<cs.length; i++ ){
			
			if( cs[i].getName().equals("newName")) {
				//재설정
				Cookie x = new Cookie("newName", "3333");
				response.addCookie(x);
			}
		}
	} else {
		out.print("Client 저장된 쿠키 정보가 없습니다.");
	} // if end

%>
</body>
</html>
















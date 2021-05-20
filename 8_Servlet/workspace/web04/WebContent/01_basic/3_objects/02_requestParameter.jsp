<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- request객체의 역할 : (2) 파라미터값 얻어오기 -->

<html>
<head><title>요청 파라미터 출력</title></head>
<body>
<h5> 방법 1 </h5>

이름 = <%= request.getParameter("name") %> <br/>
주소 = <%= request.getParameter("address") %><br/>
선택한 동물 = 
<%
	String[] values = request.getParameterValues("pet");
	if (values != null) {
	for ( String m : values) {
		out.println(m);
		}
	}
%>


<!-- 하지말자 -->
<h5> 방법 2 </h5>
<%
	Enumeration<String> paramEnum = request.getParameterNames();
	while(paramEnum.hasMoreElements()) {
		String param = (String)paramEnum.nextElement();		
		String value = request.getParameter(param);
		out.println( param + " : " + value + "<br/>" );

//---- 여러개의 값을 가진 파라미터 처리한다면		
// 		String[] value = request.getParameterValues(param);
// 		if( value != null && value.length > 1) {
// 			for( String m : value){
// 				out.println( param + " : " + m + "<br/>" );
// 			}
// 		}else{
// 			out.println( param + " : " + value[0] + "<br/>" );
// 		}
	}
%>



<h5> 방법 3 </h5>
<%  // 하지 말자
	Map<String, String[]> parameterMap = request.getParameterMap();
	String[] nameParam = (String[])parameterMap.get("name");
// 	if (nameParam != null) {
// 		out.println("이름 = " + nameParam[0] + "<br/>");
// 	}
	for( String name : nameParam){
		String value = request.getParameter(name);
		out.println( name + " : " + value + "<br/>" );
	}
%>
</body>
</html>

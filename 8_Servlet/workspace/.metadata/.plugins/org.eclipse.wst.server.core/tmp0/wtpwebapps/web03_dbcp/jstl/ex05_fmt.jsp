<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:requestEncoding  value="utf-8"/>

<jsp:useBean id="date" class="java.util.Date" />

<c:set value="${date }" var="today" />
<c:out value="${today }" /><hr>

<%
	java.util.Date date2 = new java.util.Date();
	out.print(date2);
%>

<<c:set value="abcde" var="change"></c:set>

<fmt:bundle basename="bundle.testBundle">
	<fmt:message key="name" />
	<fmt:message key="say" />
	<fmt:message key="say2"> 
		<fmt:param>${ "mbc"}</fmt:param>
		<%-- <fmt:param>${ change }</fmt:param> --%>
	</fmt:message>
</fmt:bundle>
<hr>

<fmt:formatNumber value="5000000" type="currency"  /><br>
<fmt:formatNumber value="5000000" type="currency" currencySymbol="$" /><br>
<fmt:formatNumber value="0.15" type="percent"  /><br>
<fmt:formatNumber value="500000078934" pattern="###,###,###"  /><br><hr>

<fmt:formatDate value="${ date }"  type="date"/><br>
<fmt:formatDate value="${ date }"  type="time"/><br>
<fmt:formatDate value="${ date }"  type="both"/><br>
<hr>
<p> number: <fmt:formatNumber value="12345.789" type="number" />
<p> currency: <fmt:formatNumber value="12345.789" type="currency" currencySymbol="&" />
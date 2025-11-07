<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
long createTime = session.getCreationTime();
String createTimeStr = dateFormat.format(new Date(createTime));
long lastTime = session.getLastAccessedTime();
String lastTimeStr = dateFormat.format(new Date(lastTime));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 설정 확인</title>
</head>
<body>
	<h2>Session 설정 확인</h2>
	<ul>
		<li>세션 유지 시간 : <%=session.getMaxInactiveInterval() %></li>
		<li>세션 아이디 : <%=session.getId() %></li>
		<li>최초 요청 시각 : <%=createTimeStr %></li>
		<li>마지막 요청 시각 : <%=lastTimeStr %></li>
	</ul>
</body>
</html>









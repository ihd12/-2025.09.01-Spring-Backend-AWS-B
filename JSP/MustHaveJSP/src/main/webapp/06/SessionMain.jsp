<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// jsp에서 세션의 유효기간 설정
session.setMaxInactiveInterval(60*60*24);
SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
// 세션 생성 시간 출력 메서드(최초 접속 시간)
long createTime = session.getCreationTime();
String createTimeStr = dateFormat.format(new Date(createTime));
// 마지막에 서버에 접속한 시간
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









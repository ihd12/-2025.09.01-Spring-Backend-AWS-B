<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - Fmt2</title>
</head>
<body>
	<!-- 날짜 데이터 today 변수에 저장 -->
	<c:set var="today" value="<%= new java.util.Date() %>"/>
	<h4>날짜 포맷</h4>
	<!-- type : date(날짜만), time(시간만), both(둘다) -->
	<!-- dateStyle: 날짜 표시, timeStyle:시간표시, pattern:사용자가 자유롭게 설정 -->
	full : <fmt:formatDate value="${today }" type="date" dateStyle="full"/><br/>
	short : <fmt:formatDate value="${today }" type="date" dateStyle="short"/><br/>
	long : <fmt:formatDate value="${today }" type="date" dateStyle="long"/><br/>
	default : <fmt:formatDate value="${today }" type="date" dateStyle="default"/><br/>
	<h4>시간 포맷</h4>
	full : <fmt:formatDate value="${today }" type="time" timeStyle="full"/><br/>
	short : <fmt:formatDate value="${today }" type="time" timeStyle="short"/><br/>
	long : <fmt:formatDate value="${today }" type="time" timeStyle="long"/><br/>
	default : <fmt:formatDate value="${today }" type="time" timeStyle="default"/><br/>
	<h4>날짜 시간 포맷</h4>
	full : <fmt:formatDate value="${today }" type="both" dateStyle="full"/><br/>
	pattern : <fmt:formatDate value="${today }" type="both" pattern="yyyy-MM-dd hh:mm:ss"/><br/>
	<h4>타임존 설정</h4>
	<fmt:timeZone value="GMT">
		표준시 : <fmt:formatDate value="${today }" type="both" dateStyle="full" timeStyle="full"/><br/>
	</fmt:timeZone>
	<fmt:timeZone value="America/Chicago">
		시카고시간 : <fmt:formatDate value="${today }" type="both" dateStyle="full"  timeStyle="full"/><br/>
	</fmt:timeZone>
	
</body>
</html>











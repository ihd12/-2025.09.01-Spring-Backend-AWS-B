<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - forEach2</title>
</head>
<body>
<h4>향상된 for문 형태의 forEach 태그</h4>
	<p>배열 사용하기</p>
	<% String [] rgba = {"red", "green", "blue", "black"};
	for(String color : rgba){}%>
	<c:forEach  var="color" items="<%=rgba %>">
		<span style="color:${color};">${color}</span>
	</c:forEach>
	
	<h4>varStatus 속성 살펴보기</h4>
	<table border="1">
		<!-- varStatus : 반복에 필요한 여러가지 값을 저장하는 변수 -->
		<c:forEach items="<%=rgba %>" var="color" varStatus="loop">
			<tr>
				<td style="color:${color};">count : ${loop.count }</td> <!-- 반복횟수 -->
				<td style="color:${color};">index : ${loop.index }</td> <!-- 현재 데이터의 인덱스 -->
				<td style="color:${color};">current : ${loop.current }</td> <!-- 현재 데이터 -->
				<td style="color:${color};">first : ${loop.first }</td> <!-- 첫번째 데이터는 true 나머지는 false -->
				<td style="color:${color};">last : ${loop.last }</td> <!-- 마지막 데이터는 true 나머지는 false -->
			</tr>
		</c:forEach>
	</table>
</body>
</html>
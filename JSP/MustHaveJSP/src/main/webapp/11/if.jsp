<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - if</title>
</head>
<body>
	<c:set var="number" value="100"/>
	<c:set var="string" value="JSP"/>
	<h4>JSTL의 if 태그로 짝수/홀수 판단하기</h4>
	<!-- test="조건식" -->
	<!-- var="조건식의 결과를 저장하는 변수이름" -->
	<c:if test="${number mod 2 eq 0}">
		${number}는 짝수입니다.<br/>
	</c:if>
	result : ${result }<br/>
	
	<h4>문자열 비교와 else 구문 흉내내기</h4>
	<!-- equals메서드를 사용하지 않고 eq나 ==으로 비교 -->
	<c:if test="${string eq 'Java' }" var="result2">
		문자열은 Java입니다.<br/>
	</c:if>
	
	<c:if test="${not result2 }">
		'Java'가 아닙니다.<br/>
	</c:if>
	
	<h4>조건식 주의사항</h4>
	<c:if test="100" var="result3">
		EL이 아니 정수를 지정하면 false<br/>
	</c:if>
	result3 : ${result3}
	
	<c:if test="tRuE" var="result4">
		대소문자 구분 없이 "tRuE"인 경우 true<br/>
	</c:if>
	result4 : ${result4}
	
	<c:if test=" ${ true } " var="result5">
		EL 양쪽에 공백이 있는 경우 false<br/>
	</c:if>
	result5 : ${result5}
</body>
</html>












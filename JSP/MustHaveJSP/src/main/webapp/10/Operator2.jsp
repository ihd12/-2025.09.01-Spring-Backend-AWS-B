<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("num1",9);
pageContext.setAttribute("num2","10");
pageContext.setAttribute("nullStr",null);
pageContext.setAttribute("emptyStr","");
pageContext.setAttribute("lengthZero", new Integer[0]);
ArrayList<Object> objList = new ArrayList<>();
//objList.add("1");
pageContext.setAttribute("sizeZero", objList);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어 - 연산자</title>
</head>
<body>
<h3>empty 연산자</h3>
empty nullStr = ${empty nullStr}<br/>
empty emptyStr = ${empty emptyStr}<br/>
empty lengthZero = ${empty lengthZero}<br/>
empty sizeZero = ${empty sizeZero}<br/>
<h3>삼항 연산자</h3>
num1 gt num2 ? "참" : "거짓" => ${num1 gt num2 ? "참" : "거짓"}
<h3>null 연산 - null에 숫자를 더해도 에러가 발생하지 않는다</h3>
null + 10 : ${null + 10 } <br/>
nullStr + 10 : ${nullStr + 10 } <br/>
param.noVal > 10 : ${param.noVal > 10} <br/>
</body>
</html>










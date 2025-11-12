<%@page import="utils.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("user_id") == null){
		JSFunction.alertLocation("로그인이 필요합니다.", "login.jsp", out);
		return;
	}

%>
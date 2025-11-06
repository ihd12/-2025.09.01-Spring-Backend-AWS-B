<%@page import="utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String save_check = request.getParameter("save_check");
	if(id.equals("must") && pw.equals("1234")){
		if(save_check != null && save_check.equals("on")){
			CookieManager.makeCookie(response, "loginId",id , 60*60*24*7);
		}else{
			CookieManager.deleteCookie(response, "loginId");
		}
		session.setAttribute("user_id", id);
		response.sendRedirect("index.jsp");
	}else{
		request.getRequestDispatcher("login.jsp?loginErr=1")
			.forward(request, response);
	}
%>
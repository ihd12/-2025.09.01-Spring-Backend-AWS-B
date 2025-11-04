<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if(id.equals("must") && pw.equals("1234")){
		response.sendRedirect("index.jsp");
	}else{
		request.getRequestDispatcher("login.jsp?loginErr=1")
			.forward(request, response);
	}
%>
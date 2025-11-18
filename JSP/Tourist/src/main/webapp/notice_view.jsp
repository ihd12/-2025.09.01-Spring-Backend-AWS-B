<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.updateVisitCount(num);
BoardDTO dto = dao.selectView(num);
dto.setContent(dto.getContent().replace("\r\n","<br/>"));
dao.close();
request.setAttribute("dto",dto);
request.getRequestDispatcher("notice_view_result.jsp")
.forward(request, response);
%>












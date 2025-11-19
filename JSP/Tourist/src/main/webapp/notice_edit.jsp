<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="IsLoggedIn.jsp" %>
<%
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
BoardDTO dto = dao.selectView(num);
if(!session.getAttribute("user_id").toString().equals(dto.getId())){
	JSFunction.alertBack("작성자 본인만 실행할 수 있습니다.", out);
	return;
}
request.setAttribute("dto", dto);
request.getRequestDispatcher("notice_edit_result.jsp")
.forward(request, response);
%>







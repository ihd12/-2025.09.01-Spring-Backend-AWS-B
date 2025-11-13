<%@page import="board.BoardDAO"%>
<%@page import="board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="IsLoggedIn.jsp" %>
<%
	BoardDTO dto = new BoardDTO();
	dto.setTitle(request.getParameter("title"));
	dto.setContent(request.getParameter("content"));
	dto.setNum(request.getParameter("num"));
	BoardDAO dao = new BoardDAO();
	int result = dao.updateEdit(dto);
	dao.close();
	if(result == 1){
		JSFunction.alertLocation("수정되었습니다.", 
								"notice_view.jsp?num="+dto.getNum(), 
								out);
	}else{
		JSFunction.alertBack("수정에 실패하였습니다.", out);
	}
%>









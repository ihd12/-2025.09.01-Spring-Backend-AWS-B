<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IsLoggedIn.jsp"%>
<% 
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
BoardDTO dto = dao.selectView(num);
if(session.getAttribute("user_id").toString().equals(dto.getId())){
	int result = dao.deletePost(num);
	dao.close();
	if(result == 1 ){
		JSFunction.alertLocation("삭제되었습니다.", "notice_list.jsp", out);
	}else{
		JSFunction.alertBack("삭제에 실패했습니다.", out);
	}
}else{
	JSFunction.alertBack("본인만 삭제할 수 있습니다.", out);
}
%>









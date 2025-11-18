<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
BoardDAO dao = new BoardDAO();
String searchWord = request.getParameter("searchWord");
int pageNum = 1;
if(request.getParameter("pageNum")!=null &&
	!request.getParameter("pageNum").equals("")){
	pageNum = Integer.parseInt(request.getParameter("pageNum"));
}
int pageSize = 10;
Map<String, Object> param = new HashMap<>();
param.put("searchWord", searchWord);
param.put("pageNum", pageNum);
param.put("pageSize",pageSize);
List<BoardDTO> boardLists = dao.selectListPage(param);
int totalPage = (int)Math.ceil((double)dao.selectCount(searchWord)/pageSize);
// 블럭의 첫번째 페이지 저장
int startPage = ((pageNum - 1) / pageSize) * pageSize + 1;
// 블럭의 마지막 페이지 저장
int endPage = (startPage + pageSize - 1);
// 블럭의 마지막 페이지가 전체 페이지 수 보다 크다면 전체페이지 수를 마지막 번호로 변경 
endPage = endPage > totalPage ? totalPage : endPage;
int pageTemp = (((pageNum - 1)/10)*10)+1;
dao.close();
request.setAttribute("boardLists",boardLists);
request.setAttribute("totalPage",totalPage);
request.setAttribute("startPage",startPage);
request.setAttribute("endPage",endPage);
request.setAttribute("pageNum",pageNum);
request.setAttribute("pageTemp",pageTemp);
request.getRequestDispatcher("notice_list_result.jsp")
.forward(request, response);
%>










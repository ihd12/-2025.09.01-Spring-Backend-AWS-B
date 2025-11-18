<%@page import="java.util.HashMap"%>
<%@page import="model1.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="model1.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// DB연결
BoardDAO dao = new BoardDAO();
// Map자료구조에 검색조건을 담아서 DB에 전달
Map<String, Object> param = new HashMap<>();
// 제목 혹은 내용을 검색할 컬럼명 설정
String searchField = request.getParameter("searchField");
// 검색할 단어 설정
String searchWord = request.getParameter("searchWord");
// 검색할 단어가 있으면 map 자료구조에 추가
if(searchWord != null){
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
}
// 검색조건을 포함하여 게시글의 개수를 저장
int totalCount = dao.selectCount(param);

// 페이지 처리
// web.xml에서 가지고 오는 데이터
// 한페이지에 출력할 데이터의 수
int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
// 페이지 전환 번호를 몇번까지 출력할지 정하는 수
int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
// 페이지 전환 번호의 전체 개수
int totalPage = (int)Math.ceil((double)totalCount/pageSize);
// 사용자가 누른 페이지를 저장하는 변수
int pageNum = 1;
// 사용자가 누른 페이지를 request에서 받아 저장
String pageTemp = request.getParameter("pageNum");
// 페이지 계산을 위해 문자열로된 페이지데이터를 숫자로 변경
if(pageTemp != null && !pageTemp.equals("")){
	pageNum = Integer.parseInt(pageTemp);
}
// 시작 데이터 번호 1페이지: 1, 2페이지: 11, 3페이지 : 21
int start = (pageNum - 1) * pageSize + 1;
// 마지막 데이터 번호, 1페이지 : 10, 2페이지 : 20, 3페이지 :30 
int end = pageNum * pageSize;
param.put("start", start);
param.put("end" , end);

// 게시글 데이터 저장
List<BoardDTO> boardLists = dao.selectListPage(param);
// DB연결 종료
dao.close();
request.setAttribute("pageNum",pageNum);
request.setAttribute("totalPage",totalPage);
request.setAttribute("boardLists",boardLists);
request.setAttribute("pageSize",pageSize);
request.setAttribute("blockPage",blockPage);
request.setAttribute("totalCount",totalCount);
request.setAttribute("blockPage",blockPage);
request.setAttribute("url",request.getRequestURI());
request.getRequestDispatcher("List_jstl.jsp")
.forward(request,response);

%>
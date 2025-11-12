<%@page import="board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
BoardDAO dao = new BoardDAO();
String searchWord = request.getParameter("searchWord");
List<BoardDTO> boardLists = dao.selectList(searchWord);
int totalCount = dao.selectCount(searchWord);
dao.close();
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title> 공지사항 | 고객센터 | 투어리스트인투어 </title>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="css/common.css">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/common.js"></script>  
<script src="js/jquery.smooth-scroll.min.js"></script> 
<!--[if lte IE 9]>
    <script src="js/html5shiv.js"></script>
	<script src="js/placeholders.min.js"></script>
<![endif]-->
</head>

<body>
<ul class="skipnavi">
    <li><a href="#container">본문내용</a></li>
</ul>
<!-- wrap -->
<div id="wrap">

	<jsp:include page="header.jsp" />
	
	<div id="container">
		<!-- location_area -->
		<div class="location_area customer">
			<div class="box_inner">
				<h2 class="tit_page">TOURIST <span class="in">in</span> TOUR</h2>
				<p class="location">고객센터 <span class="path">/</span> 공지사항</p>
				<ul class="page_menu clear">
					<li><a href="#" class="on">공지사항</a></li>
					<li><a href="#">문의하기</a></li>
				</ul>
			</div>
		</div>	
		<!-- //location_area -->

		<!-- bodytext_area -->
		<div class="bodytext_area box_inner">
			<form action="notice_list.jsp" class="minisrch_form">
				<fieldset>
					<legend>검색</legend>
					<input type="text" class="tbox" name="searchWord" title="검색어를 입력해주세요" placeholder="검색어를 입력해주세요">
					<button class="btn_srch">검색</button>
					<a href="notice_add.jsp" class="btn_srch">글쓰기</a>
				</fieldset>
			</form>
			<table class="bbsListTbl" summary="번호,제목,조회수,작성일 등을 제공하는 표">
				<caption class="hdd">공지사항  목록</caption>
				<thead>
					<tr>
						<th scope="col">번호</th>
						<th scope="col">제목</th>
						<th scope="col">조회수</th>
						<th scope="col">작성일</th>
					</tr>
				</thead>
				<tbody>
					<%if(boardLists.isEmpty()){ %>
						<tr><td>게시글이 없습니다.</td></tr>
					<%}else{ 
						for(BoardDTO dto : boardLists){
					%>
					<tr>
						<td><%=dto.getNum() %></td>
						<td class="tit_notice"><a href="notice_view.jsp?num=<%=dto.getNum()%>"><%=dto.getTitle() %></a> </td>
						<td><%=dto.getVisitcount() %></td>
						<td><%=dto.getPostdate() %></td>
					</tr>
					<%}} %>
				</tbody>
			</table>
			<!-- pagination -->
			<div class="pagination">
				<a href="javascript:;" class="firstpage  pbtn"><img src="img/btn_firstpage.png" alt="첫 페이지로 이동"></a>
				<a href="javascript:;" class="prevpage  pbtn"><img src="img/btn_prevpage.png" alt="이전 페이지로 이동"></a>
				<a href="javascript:;"><span class="pagenum currentpage">1</span></a>
				<a href="javascript:;"><span class="pagenum">2</span></a>
				<a href="javascript:;"><span class="pagenum">3</span></a>
				<a href="javascript:;"><span class="pagenum">4</span></a>
				<a href="javascript:;"><span class="pagenum">5</span></a>
				<a href="javascript:;" class="nextpage  pbtn"><img src="img/btn_nextpage.png" alt="다음 페이지로 이동"></a>
				<a href="javascript:;" class="lastpage  pbtn"><img src="img/btn_lastpage.png" alt="마지막 페이지로 이동"></a>
			</div>
			<!-- //pagination -->
			
		</div>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->

	<jsp:include page="footer.jsp" />

</div>
<!-- //wrap -->

<jsp:include page="quicklink.jsp" />

</body>
</html>

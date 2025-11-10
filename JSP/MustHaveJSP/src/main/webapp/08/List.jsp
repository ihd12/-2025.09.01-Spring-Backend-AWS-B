<%@page import="model1.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
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
// 게시글 데이터 저장
List<BoardDTO> boardLists = dao.selectList(param);
// DB연결 종료
dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
	<jsp:include page="../common/Link.jsp" />
	<h2>목록 보기(List)</h2>
	<form method="get">
		<table border="1" width="90%">
			<tr align="center">
				<td>
					<select name="searchField">
						<option value="title">제목</option>
						<option value="content">내용</option>
					</select>
					<input type="text" name="searchWord"/>
					<input type="submit" value="검색하기"/>
				</td>
			</tr>
		</table>
	</form>
	<table border="1" width="90%">
		<tr>
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>
		<%if(boardLists.isEmpty()){ %>
			<tr>
				<td colspan="5" align="center">
					등록된 게시물이 없습니다^^*
				</td>
			</tr>
		<%}else{
			// 게시글 번호를 역순으로 설정하기 위해 변수 생성
			int virtualNum = 0;
			for(BoardDTO dto : boardLists){
				// 전체 개수에서 1개씩 빼면서 글 번호를 생성
				virtualNum = totalCount--;
						
		%>
			<tr align="center">
				<td><%=virtualNum %></td>
				<td align="left">
					<a href="View.jsp?num=<%=dto.getNum()%>"><%=dto.getTitle() %></a>
				</td>
				<td align="center"><%=dto.getId() %></td>
				<td align="center"><%=dto.getVisitcount() %></td>
				<td align="center"><%=dto.getPostdate() %></td>
			</tr>
		<%	}
		  } %>
	</table>
	<table border="1" width="90%">
		<tr align="right">
			<td>
			<button type="button" onclick="location.href='Write.jsp';">글쓰기</button>
			</td>
		</tr>
	</table>
</body>
</html>







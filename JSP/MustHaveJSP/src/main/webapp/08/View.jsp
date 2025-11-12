<%@page import="model1.BoardDTO"%>
<%@page import="model1.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 파리미터로 가지고온 게시글 PrimaryKey를 저장
String num = request.getParameter("num");
// DB연결
BoardDAO dao = new BoardDAO();
// 조회수 1증가 
dao.updateVisitCount(num);
// 게시글 데이터 조회
BoardDTO dto = dao.selectView(num);
//db접속 종료
dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 게시판</title>
<script>
function deletePost(){
	// confirm창에서 확인 버튼을 누르면 true를 취소를 누르면 false 반환
	var confirmed = confirm("정말로 삭제하시겠습니까?");
	if(confirmed){
		// form태그 저장
		var form = document.writeFrm;
		// method설정 : post,get
		form.method = "post";
		// submit시 실행할 페이지 설정
		form.action = "DeleteProcess.jsp"
		// submit실행
		form.submit();
	}
}
</script>
</head>
<body>
	<jsp:include page="../common/Link.jsp" />
	<h2>회원 게시판 상세보기</h2>
	<form name="writeFrm">
		<!-- hidden : 보이지 않지만 submit실행시 데이터를 함께 전송하는 타입 -->
		<input type="hidden" name="num" value="<%=num %>"/>
		<table border="1" width="90%">
			<tr>
				<td>번호</td>
				<td><%=dto.getNum() %></td>
				<td>작성자</td>
				<td><%=dto.getName() %></td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><%=dto.getPostdate() %></td>
				<td>조회수</td>
				<td><%=dto.getVisitcount() %></td>
			</tr>
			<tr>
				<td>제목</td>
				<td colspan="3"><%=dto.getTitle() %></td>
			</tr>
			<tr>
				<td>내용</td>
				<td colspan="3" height="100">
					<%=dto.getContent().replace("\r\n","<br/>") %> 
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
					<%if(session.getAttribute("UserId") != null
						&& session.getAttribute("UserId").toString().equals(dto.getId())){%>
						<button type="button"
							onclick="location.href='Edit.jsp?num=<%=dto.getNum()%>';">
							수정하기
						</button>
						<button type="button" onclick="deletePost();">삭제하기</button>	
					<%} %>
					<button type="button" onclick="location.href='List.jsp';">
						목록보기
					</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>










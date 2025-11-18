<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<title> 박물관 미션 투어 당첨자 발표 | 공지사항 | 고객센터 | 투어리스트인투어 </title>
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
<fmt:formatNumber value="${(((15 - 1) / 10) * 10)}" 
	maxFractionDigits="0" var="num1" />
${num1}
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
			<ul class="bbsview_list">
				<li class="bbs_title">${dto.title}</li>
				<li class="bbs_hit">작성일 : <span>${dto.postdate}</span></li>
				<li class="bbs_date">조회수 : <span>${dto.visitcount}</span></li>
				<li class="bbs_content">
					<div class="editer_content">
					    ${dto.content}
                    </div>
				</li>
			</ul>
			<p class="btn_line txt_right">
				<c:if test="${user_id!=null && user_id == dto.id}" >
					<a href="notice_edit.jsp?num=${dto.num}" class="btn_bbs">수정하기</a>
					<button type="button" class="btn_bbs deleteBtn">삭제하기</button>
				</c:if>
				<a href="notice_list.jsp" class="btn_bbs">목록</a>
			</p>
			<ul class="near_list mt20">
				<li><h4 class="prev">다음글</h4><a href="javascript:;">추석 연휴 티켓/투어 배송 및 직접 수령 안내</a></li>		
				<li><h4 class="next">이전글</h4><a href="javascript:;">이번 여름 휴가 제주 갈까? 미션 투어 (여행경비 50만원 지원)</a></li>
			</ul>
		</div>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->

	<jsp:include page="footer.jsp" />

</div>
<!-- //wrap -->

<jsp:include page="quicklink.jsp" />
<form name="writeFrm">
	<input type="hidden" name="num" value="${dto.num }">
</form>
<script>
	document.querySelector(".deleteBtn").addEventListener("click", ()=>{
		let confirmed = confirm("정말로 삭제하시겠습니까?");
		if(confirmed){
			//let form = document.writeFrm;
			// form태그 생성 및 설정
			let form = document.createElement("form");
			form.method="post";
			form.action="deleteProcess.jsp";
			// input태그 생성 및 설정
			let input = document.createElement("input");
			input.type = "hidden";
			input.name = "num";
			input.value = "${dto.num}";
			// form태그에 input태그 추가
			form.appendChild(input);
			// body태그에 form태그 추가
			document.body.appendChild(form);
			form.submit();
		}
	})
</script>
</body>
</html>
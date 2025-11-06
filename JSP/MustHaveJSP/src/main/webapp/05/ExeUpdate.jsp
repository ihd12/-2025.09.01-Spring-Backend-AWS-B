<%@page import="java.sql.PreparedStatement"%>
<%@page import="common.DBConnPool"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 추가 테스트(executeUpdate() 사용)</h2>
<%
	// DB 연결
	DBConnPool jdbc = new DBConnPool();
	String id = "test1";
	String pass = "1111";
	String name = "테스트1회원";
	
	// sql의 ?의미 : SQL에 설정할 동적 데이터
	String sql = "INSERT INTO member(id,pass,name,regidate)" 
				          + " VALUES(?, ?,   ?   ,sysdate)";
	jdbc.psmt = jdbc.con.prepareStatement(sql);
	jdbc.psmt.setString(1, id); // 첫번째 ?의 값 설정
	jdbc.psmt.setString(2, pass);// 두번째 ?의 값 설정
	jdbc.psmt.setString(3, name);// 세번째 ?의 값 설정
	// executeUpdate() : INSERT, UPDATE, DELETE문을 실행하는 메서드
	int inResult = jdbc.psmt.executeUpdate();
	out.println(inResult + "행이 입력되었습니다.");
	
	jdbc.close();
%>
</body>
</html>













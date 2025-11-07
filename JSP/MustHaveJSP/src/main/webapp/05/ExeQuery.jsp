<%@page import="java.util.ArrayList"%>
<%@page import="membership.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="common.DBConnPool"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// DB연결
	DBConnPool jdbc = new DBConnPool();
	//SQL 작성
	String sql = "SELECT id, pass, name, regidate FROM member";
	// con을 사용해 Statement를 생성
	jdbc.psmt = jdbc.con.prepareStatement(sql);
	//jdbc.stmt = jdbc.con.createStatement();
	// executeQuery(sql) : sql실행 후 결과를 받는 메서드
	jdbc.rs = jdbc.psmt.executeQuery();
	//jdbc.rs = jdbc.stmt.executeQuery(sql);
	// ResultSet : SELECT문의 결과를 저장하는 클래스
	// Set자료구조라서 next()메서드를 사용하여 데이터를 꺼내야합니다.
	List<MemberDTO> memberList = new ArrayList<>();
	while(jdbc.rs.next()){
		String id = jdbc.rs.getString(1);
		String pw = jdbc.rs.getString(2);
		String name = jdbc.rs.getString("name");
		String regidate = jdbc.rs.getDate("regidate").toLocaleString();
		memberList.add(new MemberDTO(id,pw,name,regidate));
	}
	request.setAttribute("memberList", memberList);
	request.getRequestDispatcher("memberlist.jsp")
		.forward(request, response);
	jdbc.close();
%>













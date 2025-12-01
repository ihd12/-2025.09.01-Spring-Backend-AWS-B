<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Properties"%>
<%@page import="smtp.NaverSMTP"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Map<String, String> emailInfo = new HashMap<>();
emailInfo.put("from", request.getParameter("from"));
emailInfo.put("to", request.getParameter("to"));
emailInfo.put("subject", request.getParameter("subject"));
String content = request.getParameter("content");
String format = request.getParameter("format");
if(format.equals("text")){
	emailInfo.put("content", content);
	emailInfo.put("format", "text/plain;charset=UTF-8");
}else if(format.equals("html")){
	content = content.replace("\r\n","<br/>");
	emailInfo.put("content", content);
	String htmlContent = "";
	try{
		String templatePath = application.getRealPath("/17/MailForm.html");
		BufferedReader br = new BufferedReader(new FileReader(templatePath));
		String oneLine;
		while((oneLine = br.readLine()) != null){
			htmlContent += oneLine + "\n"; 
		}
		br.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	htmlContent = htmlContent.replace("__CONTENT__", content);
	emailInfo.put("content", htmlContent);
	emailInfo.put("format", "text/html;charset=UTF-8");
}

try{
	String configPath = application.getInitParameter("configFile");
	FileInputStream fis = new FileInputStream(configPath);
	Properties prop = new Properties();
	prop.load(fis);
	NaverSMTP smtpServer = new NaverSMTP(prop.getProperty("id"), prop.getProperty("pw"));
	smtpServer.emailSending(emailInfo);
	out.print("이메일 전송 성공");
}catch(Exception e){
	out.print("이메일 전송 실패");
	e.printStackTrace();
}


%>
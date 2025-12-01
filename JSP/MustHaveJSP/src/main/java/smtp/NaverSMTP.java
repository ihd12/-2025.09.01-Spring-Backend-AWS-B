package smtp;

import java.util.Map;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class NaverSMTP {
	private final Properties serverInfo;
	private final Authenticator auth;
	
	public NaverSMTP(String id, String pw) {
		serverInfo = new Properties();
		serverInfo.put("mail.smtp.host", "smtp.naver.com");
		serverInfo.put("mail.smtp.port", "465");
		serverInfo.put("mail.smtp.auth", "true");
		serverInfo.put("mail.smtp.debug", "true");
		serverInfo.put("mail.smtp.ssl.enable", "true");
//		serverInfo.put("mail.smtp.socketFactory.port", "465");
//		serverInfo.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//		serverInfo.put("mail.smtp.socketFactory.fallback", "false");
		auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(id, pw);
			}
		};
		
	}
	public void emailSending(Map<String, String> mailInfo) throws MessagingException {
		Session session = Session.getInstance(serverInfo, auth);
		session.setDebug(true);
		
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(mailInfo.get("from")));
		msg.addRecipient(Message.RecipientType.TO,new InternetAddress(mailInfo.get("to")));
		msg.setSubject(mailInfo.get("subject"));
		msg.setContent(mailInfo.get("content"), mailInfo.get("format"));
		Transport.send(msg);
	}
	

}










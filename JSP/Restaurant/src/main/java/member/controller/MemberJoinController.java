package member.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class MemberJoinController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Enumeration<String> a = req.getHeaderNames();
		while(a.hasMoreElements()) {
			System.out.println(a.nextElement() +" : "+req.getHeader(a.nextElement()));
		}
		String uri = req.getHeader("Referer");
		URL url = new URL(uri);
		System.out.println("URI : "+url.getPath());
		
		System.out.println(uri);
		uri = uri.substring(uri.indexOf("/",8));
		System.out.println("Referer : "+uri);
		
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
}







package member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.service.LoginService;
import membership.MemberDTO;

@WebServlet("/login.do")
public class LoginController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	LoginService service = new LoginService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//화면만을 출력하는 doGet
		req.getRequestDispatcher("/12_1/LoginForm.jsp")
		.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// request에서 id, pw를 저장
		String userId = req.getParameter("user_id");
		String userPwd = req.getParameter("user_pw");
		MemberDTO dto = service.getMember(userId, userPwd);
		if(dto.getId() != null){
			req.getSession().setAttribute("UserId", dto.getId());
			req.getSession().setAttribute("UserName", dto.getName());
			// sendRedirect 사용시 WebServlet에 사용한 주소를 입력
			resp.sendRedirect("/MustHaveJSP/login.do");
		}else{
			//일치하지 않으면 로그인 오류 출력
			req.setAttribute("LoginErrMsg", "로그인 오류입니다.");
			req.getRequestDispatcher("/12_1/LoginForm.jsp")
				.forward(req, resp);
		}
	}
}









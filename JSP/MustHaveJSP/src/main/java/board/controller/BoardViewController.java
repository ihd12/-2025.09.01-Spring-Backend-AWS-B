package board.controller;

import java.io.IOException;

import board.service.BoardService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model1.BoardDTO;

@WebServlet("/board.do")
public class BoardViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BoardService service = new BoardService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파리미터로 가지고온 게시글 PrimaryKey를 저장
		String num = req.getParameter("num");
		
		// 조회수 1증가 
		service.editVisitCount(num);
		// 게시글 데이터 조회
		BoardDTO dto = service.getBoard(num, "view");
		
		req.setAttribute("dto", dto);
		req.getRequestDispatcher("/12_1/ViewResult.jsp")
		.forward(req, resp);
	}
}










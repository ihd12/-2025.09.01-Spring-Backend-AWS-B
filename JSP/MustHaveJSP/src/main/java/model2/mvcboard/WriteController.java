package model2.mvcboard;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.FileUtil;
import utils.JSFunction;

@WebServlet("/mvcboard/write.do")
@MultipartConfig(
	maxFileSize = 1024*1024*1, 
	maxRequestSize = 1024*1024*10
)

public class WriteController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/14/Write.jsp")
		.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=UTF-8");
		//D:\(09.01)SpringBackendAWSDeploy\JSP\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\MustHaveJSP
		String saveDirectory = getServletContext().getRealPath("/Uploads");
		String originalFileName = "";
		try {
			originalFileName = FileUtil.uploadFile(req, saveDirectory);
		}catch(Exception e) {
			JSFunction.alertLocation("파일 업로드 오류입니다.","../mvcboard/write.do" ,out);
			return;
		}

		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setName(req.getParameter("name"));
		dto.setTitle(req.getParameter("title"));
		dto.setContent(req.getParameter("content"));
		dto.setPass(req.getParameter("pass"));
		if(!originalFileName.equals("")) {
			String saveFileName = FileUtil.renameFile(saveDirectory, originalFileName);
			dto.setOfile(originalFileName);
			dto.setSfile(saveFileName);
		}
		
		
		MVCBoardDAO dao = new MVCBoardDAO();
		int iResult = dao.insertWrite(dto);
		dao.close();
		if(iResult == 1){
			resp.sendRedirect("../mvcboard/list.do");
		}else{
			JSFunction.alertLocation("글쓰기에 실패하였습니다.","../mvcboard/write.do", out);
		}
	}
}












package ccc.edu.hut.servlet;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ccc.edu.hut.database.DB;
import ccc.edu.hut.bean.LyTable;
import ccc.edu.hut.bean.User;

public class AddServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		req.setCharacterEncoding("gb2312");
		res.setCharacterEncoding("gb2312");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		User user = (User)req.getSession().getAttribute("user");
		LyTable ly = new LyTable();
		ly.setUserId(user.getId());
		ly.setDate(new Date(System.currentTimeMillis()));
		ly.setTitle(title);
		ly.setContent(content);
		if(new DB().addInfo(ly)) {
			res.sendRedirect("success.jsp");
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		doPost(req, res);
	}
}

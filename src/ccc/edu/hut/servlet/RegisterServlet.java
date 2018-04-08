package ccc.edu.hut.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ccc.edu.hut.database.DB;

public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		req.setCharacterEncoding("gb2312");
		res.setCharacterEncoding("gb2312");
		String username = req.getParameter("username");
		String password = req.getParameter("pwd");
		if(new DB().insertUser(username, password)) {
			res.sendRedirect("login.jsp");
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		doPost(req, res);
	}
}

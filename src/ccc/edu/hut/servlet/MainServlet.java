package ccc.edu.hut.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ccc.edu.hut.database.DB;
import ccc.edu.hut.bean.LyTable;
import ccc.edu.hut.bean.User;

public class MainServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("gb2312");
		res.setCharacterEncoding("gb2312");
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		DB db = new DB();
		HttpSession session = req.getSession();
		
		User user = (User)session.getAttribute("user");
		if(user == null) {
			user = db.checkUser(username, pwd);			
		}
		session.setAttribute("user", user);
		if(user != null) {
			ArrayList<LyTable> al = db.findLyInfo();
			session.setAttribute("al", al);
			res.sendRedirect("main.jsp");
		} else {
			res.sendRedirect("login.jsp");
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		doPost(req, res);
	}
}

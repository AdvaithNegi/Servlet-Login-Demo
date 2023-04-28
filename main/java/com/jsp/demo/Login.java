package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (name.equals("admin") && password.equals("admin123")) {
			PrintWriter printWriter = res.getWriter();
			printWriter.write("<h1>Admin Logged In Successfully</h1>");
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
			requestDispatcher.include(req, res);
		}

	}

}

package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginController extends HttpServlet {
	String correctEmail;
	String correctPassword;

	public void init(ServletConfig config) throws ServletException {
		correctEmail = config.getInitParameter("email");
		correctPassword = config.getInitParameter("password");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		ServletConfig config = getServletConfig();

//		String correctEmail = config.getInitParameter("email");
//		String correctPassword = config.getInitParameter("password");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email.equals(correctEmail) && password.equals(correctPassword)) {
			response.sendRedirect("Home.jsp");

		} else {
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
		}
	}

}

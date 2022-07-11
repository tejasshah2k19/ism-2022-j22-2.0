package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ExtendSessionController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int time = Integer.parseInt(request.getParameter("time"));
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(time * 60);
		response.sendRedirect("Home.jsp");
	}

}

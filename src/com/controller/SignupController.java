package com.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupController extends HttpServlet {

	// init
	// service
	// destroy

	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");

		response.sendRedirect("Login.jsp");
	}

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
}

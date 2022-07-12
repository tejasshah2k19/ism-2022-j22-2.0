package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintAllRequestHeaderController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Enumeration<String> headers = request.getHeaderNames();
	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		
		out.print("<html><body>");
		
		while(headers.hasMoreElements()) {
			String name = headers.nextElement();
			out.print(name+"  =>  " + request.getHeader(name)  +"<br>");
		}
		
		
		out.print("</body></html>");
	}

}

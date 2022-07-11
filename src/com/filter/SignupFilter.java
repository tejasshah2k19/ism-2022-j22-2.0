package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignupFilter implements Filter {

	public void destroy() {
		System.out.println("SignupFilterDestroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter From SignupFilter");

		boolean isError = false;
		// validation
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		// isError
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}
		// email
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailNameError", "Please Enter Email");
		}
		// password

		// back
		if (isError) {
			request.getRequestDispatcher("Signup.jsp").forward(request, response);
		} else {

			// go ahead
			chain.doFilter(request, response);//servlet -- second filter 
		}
	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("SignupFilterInit()");
	}

}

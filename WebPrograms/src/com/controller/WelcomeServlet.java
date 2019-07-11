package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public WelcomeServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Unauthorised Entry to this page </h1>");
		out.println("<h3>Please <a href='login.html'>login</a> first</h3>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("t1");
		String pwd=request.getParameter("t2");

		PrintWriter out=response.getWriter();
		if(name.contentEquals(pwd))
		{
			out.println("<h1>");
			out.println("Welcome !" +name);
			out.println("</h1>");
		}
		else
		{
			out.println("<h1> Sorry Invalid Credentials </h1>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}

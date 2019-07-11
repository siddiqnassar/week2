package com;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginPage() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Unauthorised Entry to this page </h1>");
		out.println("<h3>Please <a href='facebook.html'>login</a> first</h3>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String name=request.getParameter("t1");
		String pwd=request.getParameter("t2");
        
		PrintWriter out=response.getWriter();
		JdbcConnector jc=new JdbcConnector();
		
		
		if(jc.isValidUser(name,pwd))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h1> Sorry Invalid Credentials </h1>");
			RequestDispatcher rd = request.getRequestDispatcher("Invalid.jsp");
			rd.forward(request, response);
		}
		
	}

}

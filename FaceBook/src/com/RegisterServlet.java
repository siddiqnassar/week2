package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("t1");
		String pwd=request.getParameter("t2");
        String pwd1=request.getParameter("t3");
		PrintWriter out=response.getWriter();
		JdbcConnector jc=new JdbcConnector();
		boolean status = jc.register(name,pwd);
		System.out.println(status);
		
		if(status==true&&(pwd.contentEquals(pwd1)))
		{
			RequestDispatcher rd = request.getRequestDispatcher("registeredDone.jsp");
			rd.forward(request, response);
		}
		
		else
		{
			out.println("<h1> Could not register. Register Again </h1>");
			RequestDispatcher rd = request.getRequestDispatcher("Register.html");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

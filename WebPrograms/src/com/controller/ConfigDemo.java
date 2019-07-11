package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.servicecontext.ServiceContext;


public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String name;  
   
    public ConfigDemo() {
        super();
        
    }
    public void init(ServletConfig config)throws ServletException{
    	name=config.getInitParameter("user");
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<h1> Good morning"+name+"</h1>");
		ServletContext ctx=request.getServletContext();
		String comp=ctx.getInitParameter("Company");
		out.println("<h2>Welcome to "+comp+"</h2>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

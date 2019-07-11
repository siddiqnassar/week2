package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
@WebServlet("/profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Profile() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Unauthorised Entry to this page </h1>");
		out.println("<h3>Please <a href='login.html'>login</a> first</h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from EMPLOYEE");
			while(rs.next())
			{
				System.out.println("Name :"+rs.getString(1));
				System.out.println("Age :"+rs.getInt(2));
				System.out.println();
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}

package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;


public class JdbcConnector {
	private Connection con=null;
	private String name;
	private String password;
	public JdbcConnector(){
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdb","root","Sapient123");
	System.out.println("Connection Established");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
    public String getName(){
    	return name;
    }
    public String getPassword()
    {
    	return password;
    }
    public void setName(String uname)
    {
    	this.name=uname;
    }
    public void setPassword(String password)
    {
    	this.password=password;
    }
    public boolean isValidUser(String name,String password)
    {
    	try {
    	Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select epassword from Employee where ename='"+ name+"'");
		if(rs.next())
		{
			if(rs.getString("epassword").equals(password))
			{
				return true;
			}
		} 	
    }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return false;
    	
}
    
    public boolean register(String name,String password)
    {
    	try {
    	java.sql.PreparedStatement stmt = con.prepareStatement("insert into Employee values(?,?)");
		stmt.setString(1, name);
		stmt.setString(2, password);
		boolean status= stmt.execute();
		//System.out.println("ksdjljdf");
		return true;
    }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return false;
    	
}
}
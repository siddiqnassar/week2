package nassar.sapient;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class Employee {
public static void main(String[] args)
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sapient123");
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

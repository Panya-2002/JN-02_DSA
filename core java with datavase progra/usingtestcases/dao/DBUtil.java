//Program to demonstrate Java Database Connectivity - DBUtil class 
package com.tns.testcasedatabaseexample.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection cn;
	static
	{
		
		try {
			//load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","alpana@123"); //connect to database");
			System.out.println("Connection established...");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection()
	{
		return cn;
	}
;
}

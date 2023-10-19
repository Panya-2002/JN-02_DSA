package com.tns.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection cn;
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "alpana@123");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error..."+e.getMessage());
		}	
	}
	public static Connection getConnection()
	{
		return cn;
	}
}

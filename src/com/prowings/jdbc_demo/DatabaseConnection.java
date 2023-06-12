package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static final String url = "jdbc:mysql://localhost:3306/college_db";
	public static final String userName = "root";
	public static final String password = "SnehalV@2206";
	
	public static void main(String[] args) 
	{
		try(Connection con = DriverManager.getConnection(url, userName, password))
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connect successfully...");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

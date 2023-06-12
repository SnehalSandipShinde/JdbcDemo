package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropDatabase {
	

	public static final String url = "jdbc:mysql://localhost:3306/";
	public static final String password = "SnehalV@2206";
	public static final String user = "root";
	
	public static void main(String[] args) 
	{
		
		try(Connection con = DriverManager.getConnection(url, user, password); Statement stmt = con.createStatement();)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String query = "DROP DATABASE college_db";
			
			stmt.executeUpdate(query);
			
			System.out.println("Database droped successfully");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
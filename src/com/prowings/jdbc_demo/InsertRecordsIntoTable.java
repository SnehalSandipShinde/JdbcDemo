package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordsIntoTable {

	public static final String URL = "jdbc:mysql://localhost:3306/COLLEGE_DB"; 
	public static final String USERNAME = "root";
	public static final String PASSWORD = "SnehalV@2206";
	
	
	public static void main(String[] args) 
	{
		
		try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement stmt = con.createStatement();) 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String query = "INSERT INTO Student VALUES ('Zara', 12354, 18)";
			
			stmt.executeUpdate(query);
			
			query = "INSERT INTO Student VALUES ('Ira', 98345, 12)";
	         
			stmt.executeUpdate(query);
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		
		
	}
}

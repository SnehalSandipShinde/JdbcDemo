package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String USER = "root";
	public static final String PASSWORD = "SnehalV@2206";
	
	
	public static void main(String[] args) 
	{
		
		try(Connection con = DriverManager.getConnection(URL,USER,PASSWORD); Statement stmt = con.createStatement())
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String qurey = "CREATE DATABASE COLLEGE_DB";
			
			stmt.executeUpdate(qurey);
			
			System.out.println("database created successfully...");
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}	
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
}

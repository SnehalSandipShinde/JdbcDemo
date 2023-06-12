package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

	public static final String url = "jdbc:mysql://localhost:3306/COLLEGE_DB";
	public static final String password = "SnehalV@2206";
	public static final String user = "root";
	
	
	public static void main(String[] args) 
	{
		
		try(Connection con = DriverManager.getConnection(url,user,password); Statement stmt = con.createStatement())
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String qurey = "CREATE TABLE Student( \r\n"
					+ "NAME VARCHAR (59) ,\r\n"
					+ "PHNUM INT , \r\n"
					+ "ROLL INT  \r\n"
					+ ");";
			
			stmt.executeUpdate(qurey);
			
			System.out.println("table created successfully...");
			
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

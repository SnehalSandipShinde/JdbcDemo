package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
	
	public static final String URL = "jdbc:mysql://localhost:3306/COLLEGE_DB";
	public static final String USER = "root";
	public static final String PASSWORD = "SnehalV@2206";
	public static final String selelctQuery = "SELECT * FROM STUDENT";
	
	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = con.createStatement();) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String query = "delete from student where roll = 30";
			
			stmt.executeUpdate(query);
			
			ResultSet rs = stmt.executeQuery(selelctQuery);
				
			while (rs.next()) 
			{
				System.out.println("----------------------------------------");
				System.out.println("name:- " + rs.getString(1));
				System.out.println("PhnNum:- " + rs.getInt(2));
				System.out.println("RollNum:- " + rs.getInt(3));
				System.out.println("----------------------------------------");
			}
			
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

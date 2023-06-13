package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {

	public static final String URL = "jdbc:mysql://localhost:3306/COLLEGE_DB";
	public static final String USER = "root";
	public static final String PASSWORD ="SnehalV@2206";
	public static final String QUERY ="SELECT * FROM student";
	
	
	public static void main(String[] args) 
	{
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(QUERY);
			
			while(rs.next()) {
				System.out.println("----------------------------------------");
				System.out.println("name:- "+ rs.getString(1));
				System.out.println("PhnNum:- "+ rs.getInt(2));
				System.out.println("RollNum:- "+ rs.getInt(3));
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
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

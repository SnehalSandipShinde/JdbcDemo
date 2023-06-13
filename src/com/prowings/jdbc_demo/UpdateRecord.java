package com.prowings.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static final String URL = "jdbc:mysql://localhost:3306/COLLEGE_DB";
	public static final String USER = "root";
	public static final String PASSWORD = "SnehalV@2206";
	public static final String QUERY = "SELECT * FROM student";

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = con.createStatement();) 
		{

			Class.forName("com.mysql.cj.jdbc.Driver");

			String query2 = "UPDATE student " + "SET roll = 30 WHERE name = 'zara'";

			stmt.executeUpdate(query2);
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) 
			{
				// Display values
				System.out.println("Name: " + rs.getString(1));
				System.out.println(", PhnNum: " + rs.getInt(2));
				System.out.println(", Roll: " + rs.getString(3));
			}
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
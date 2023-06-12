package com.prowings.jdbc_demo;

import java.sql.*;

public class FirstExample {

	public static final String url = "jdbc:mysql://localhost:3306/student_db";
	public static final String password = "SnehalV@2206";
	public static final String user = "root";

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");// 1. load the driverClass

//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());//2nd way to load the driver class

		Connection con = DriverManager.getConnection(url, user, password);// 2. Create a connection

		String selectQuery = "select * from student";

		CallableStatement stmt = con.prepareCall(selectQuery);// 3. create Query

		ResultSet rs = stmt.executeQuery();
// process the data
		while (rs.next()) {

			String name = rs.getString("name");
			int phoneNum = rs.getInt("PHNUM");
			int roll = rs.getInt("roll");

			System.out.print(name + "\n");
			System.out.print(phoneNum + "\n");
			System.out.print(roll + "\n");

		}

		rs.close();
		con.close();
	}
}

package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
	
	private static String url = "jdbc:mysql://localhost:3306/tour_guide";
	private static String userName = "root";
	private static String password = "#Chamikara123";
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
		}
		catch(Exception e) {
			System.out.println("Database connection is not success!");
			
		}
		
		return con;
	}

}

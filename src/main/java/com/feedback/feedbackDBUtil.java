package com.feedback;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.connectDB;

public class feedbackDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	public static boolean insertFeedback(String uID, String fType, String fDetails) {
		
		boolean isSuccess = false;
		
		
		try {
			con = connectDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "Insert into feedback(userID, feefbackType, feedbackDetails) values ('"+uID+"', '"+fType+"','"+fDetails+"' )";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		return isSuccess;
	}
	
		public static List<feedback> getFeedback(String uID){
		

		ArrayList<feedback> fd = new ArrayList<>();
		
		try {
			
			con = connectDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "select userID, feedbackDetails from feedback where userID = '"+uID+"'";
			
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String userID = rs.getString(2);
				String detailF = rs.getString(5);

				feedback fd1 = new feedback(userID, detailF);
		
				fd.add(fd1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return fd;
	}
		
		public static boolean deleteFeedback(String userId) {
			
			boolean isSuccess = false;
			
			try {
				
				con = connectDB.getConnection();
				stmt = con.createStatement();
				
				String sql = "delete from feedback where userID = '"+userId+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
		}
		
		public static boolean validate(String uID) {
			boolean isSuccess = false;
			
			
			try{
				
				con = connectDB.getConnection();
				stmt = con.createStatement();
				
				String sql = "select * from feedback where userID = '"+uID+"'";
				
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					
					isSuccess = true;
				
				}
				else {
					isSuccess = false;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			return isSuccess;
		}
	

}

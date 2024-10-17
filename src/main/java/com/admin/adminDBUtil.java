package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class adminDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String aID, String pass) {
		
		try{
			
			con = connectDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from tour_guide.admin where adminID = '"+aID+"' and password = '"+pass+"'";
			
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
	
	public static List<admin> getAdmin(String adminID){
		
		int convertID = Integer.parseInt(adminID);
		ArrayList<admin> ad = new ArrayList<>();
		
		try {
			
			con = connectDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from admin where adminID = '"+convertID+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int adID = rs.getInt(1);
				String aName = rs.getString(2);
				String aType = rs.getString(3);
				String cNo = rs.getString(4);
				String email = rs.getString(5);
				String aPwd = rs.getString(6);
				
				admin ad1 = new admin(adID, aName, aType, cNo, email, aPwd);
				
				ad.add(ad1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return ad;
	}
	
	public static boolean updateAdmin(String ID, String Name, String Type, String Cont, String Email) {
		
		int convertID = Integer.parseInt(ID);
		
		try {
			con = connectDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "update tour_guide.admin set adminName = '"+Name+"', adminType = '"+Type+"', contactNo = '"+Cont+"', email = '"+Email+"' where adminID = '"+convertID+"'";
			
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
	
	
	

	
	

}

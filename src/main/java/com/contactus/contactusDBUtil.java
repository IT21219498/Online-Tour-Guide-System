package com.contactus;

import java.sql.Connection;
import java.sql.Statement;

import com.admin.connectDB;

public class contactusDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	
	
	public static boolean insertContactUS(String uID, String tType, String gMode, String conNo, String subject) {
		
		boolean isSuccess = false;
		
		
		try {
			con = connectDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "Insert into contactus(userID, touristType, guideMode, contactNo, subject) values ('"+uID+"', '"+tType+"','"+gMode+"','"+conNo+"','"+subject+"' )";
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

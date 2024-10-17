package com.feedback;

public class feedback {
	
	private String userID;
	private String details;
	
	public feedback(String userID, String details) {
		this.userID = userID;
		this.details = details;
	}

	public String getUserID() {
		return userID;
	}

	
	public String getDetails() {
		return details;
	}
	

}

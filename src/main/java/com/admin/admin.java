package com.admin;

public class admin {
	private int aID;
	private String aName;
	private String aType;
	private String contact;
	private String email;
	private String pwd;
	public admin(int aID, String aName, String aType, String contact, String email, String pwd) {
		this.aID = aID;
		this.aName = aName;
		this.aType = aType;
		this.contact = contact;
		this.email = email;
		this.pwd = pwd;
	}
	
	public int getaID() {
		return aID;
	}
	
	public String getaName() {
		return aName;
	}
	
	public String getaType() {
		return aType;
	}
	
	public String getContact() {
		return contact;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPwd() {
		return pwd;
	}
	
}

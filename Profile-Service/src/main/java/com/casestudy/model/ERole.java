package com.casestudy.model;

public class ERole {

	private String USER_CUSTOMER;
	private String USER_ADMIN;
	
	
	public String getUSER_CUSTOMER() {
		return USER_CUSTOMER;
	}
	public void setUSER_CUSTOMER(String uSER_CUSTOMER) {
		USER_CUSTOMER = uSER_CUSTOMER;
	}
	public String getUSER_ADMIN() {
		return USER_ADMIN;
	}
	public void setUSER_ADMIN(String uSER_ADMIN) {
		USER_ADMIN = uSER_ADMIN;
	}
	public ERole(String uSER_CUSTOMER, String uSER_ADMIN) {
		super();
		USER_CUSTOMER = uSER_CUSTOMER;
		USER_ADMIN = uSER_ADMIN;
	}
	public ERole() {
		super();
	}
	@Override
	public String toString() {
		return "ERole [USER_CUSTOMER=" + USER_CUSTOMER + ", USER_ADMIN=" + USER_ADMIN + "]";
	}
	
}

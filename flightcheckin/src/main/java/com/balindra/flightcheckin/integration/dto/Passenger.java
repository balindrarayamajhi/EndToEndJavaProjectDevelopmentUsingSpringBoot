package com.balindra.flightcheckin.integration.dto;


public class Passenger {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
//	public String getMiddlename() {
//		return middlename;
//	}
//	public void setMiddlename(String middlename) {
//		this.middlename = middlename;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}

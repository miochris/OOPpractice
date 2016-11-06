package com.fdmgroup.pension;

public class Person {


	private String firstname;
	private String lastname;
	private String dateOfBirth;
	
	public String fullName(){
		
		return firstname + " " + lastname;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


}

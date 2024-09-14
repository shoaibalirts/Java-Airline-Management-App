package com.airline.controllers;

public class Passenger {
	private String firstName;
	private String lastName;
	private String dob;
	private Gender gender;
	
	// generate getters and setters
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	// generate toString method instead of Syste.out.println(this)
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
	
	

}

package com.mustafa.models;


public class Person {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Invoice invoice = new Invoice();
	private String userName = "mustafashakaroun";
	private String Password = "123456";
	
	public Person(){
		
	}
	
	public Person(String firstName, String lastName, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String fullName(){
		String fullName = this.firstName.concat(" ").concat(this.lastName);
		return fullName;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public String getUserName(){
		return userName;
	}
	

	public String getPassword() {
		return Password;
	}

	
	
}

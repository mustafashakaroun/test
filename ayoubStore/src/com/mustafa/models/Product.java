package com.mustafa.models;

public abstract class Product {
	
	private String serialNumber;
	private double discount;
	private double salary;
	
	public Product (){
		
	}
	
	public Product(double discount, double salary, String serialNumber) {
		super();
		this.discount = discount;
		this.salary = salary;
		this.serialNumber = serialNumber;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getSerialNumber(){
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber){
		this.serialNumber = serialNumber;
	}

}

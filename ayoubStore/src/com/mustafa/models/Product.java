package com.mustafa.models;

public abstract class Product {
	
	private double discount;
	private double salary;
	
	public Product(double discount, double salary) {
		super();
		this.discount = discount;
		this.salary = salary;
	}
	
	public Product (){
		
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
	
	

}

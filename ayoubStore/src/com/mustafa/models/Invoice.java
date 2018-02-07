package com.mustafa.models;

public class Invoice{
	
	private double totalSalary;
	private Product[] arrayProducts;
	
	public Invoice(double totalSalary, Product[] arrayProducts) {
		super();
		this.totalSalary = totalSalary;
		this.arrayProducts = arrayProducts;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public Product[] getArrayProducts() {
		return arrayProducts;
	}

	public void setArrayProducts(Product[] arrayProducts) {
		this.arrayProducts = arrayProducts;
	}

	
}

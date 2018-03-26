package com.mustafa.models;

import java.util.ArrayList;

public class Invoice{
	
	private double totalSalary;
	private ArrayList<Product> products = new ArrayList<>();
	
	
	
	public Invoice() {
		super();
	}

	public Invoice(double totalSalary) {
		super();
		this.totalSalary = totalSalary;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public void modifyPrice(double price){
		this.totalSalary += price;
	}

	
}

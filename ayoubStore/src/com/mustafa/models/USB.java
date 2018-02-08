package com.mustafa.models;

public class USB extends Product{

	private String size;

	public USB() {

	}

	public USB(double discount, double salary, String serialNumber, String name,String size) {
		super(discount, salary, serialNumber, name);
		this.size = size;
	}
	
	
}

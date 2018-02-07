package com.mustafa.models;

public class Printer extends Product{

	private String name;
	
	public Printer() {
		
	}

	public Printer(double discount, double salary, String serialNumber, String name) {
		super(discount, salary, serialNumber);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

package com.mustafa.models;

public class Mouse extends Product{

	private boolean wirless;

	public Mouse() {

	}

	public Mouse(double discount, double salary, String serialNumber, boolean wirless) {
		super(discount, salary, serialNumber);
		this.wirless = wirless;
	}

	public boolean isWirless() {
		return wirless;
	}

	public void setWirless(boolean wirless) {
		this.wirless = wirless;
	}
	
	
	
}

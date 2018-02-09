package com.mustafa.models;

public class Mouse extends Product{

	private boolean silent;

	public Mouse() {

	}

	public Mouse(double discount, double salary, String serialNumber, String name) {
		super(discount, salary, serialNumber, name);

	}

	public boolean isSilent() {
		return silent;
	}

	public void setSilent(boolean silent) {
		this.silent = silent;
	}

	@Override
	public String toString() {
		return super.toString() + (isSilent()?" [silent :) ,":"[");
	}

	
	
	
}

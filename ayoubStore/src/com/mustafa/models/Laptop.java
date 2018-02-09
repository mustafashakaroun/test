 package com.mustafa.models;

public class Laptop extends Product{

	private String hardDisk;
	private String RAM;
	private String CPU;
	
	public Laptop() {
	}
	
	public Laptop(double discount, double salary, String serialNumber, String hardDisk, String RAM, String CPU, String name) {
		super(discount, salary, serialNumber, name);
		this.hardDisk = hardDisk;
		this.RAM = RAM;
		this.CPU = CPU;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	@Override
	public String toString() {
		return super.toString() + "[hardDisk=" + hardDisk + ", RAM=" + RAM + ", CPU=" + CPU + "]";
	}
	
	
	
}

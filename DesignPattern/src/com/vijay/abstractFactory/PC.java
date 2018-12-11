package com.vijay.abstractFactory;

public class PC implements Computer {

	private float hardDisk;
	private float ram;
	
	public PC(float hardDisk,float ram) {
		this.hardDisk = hardDisk;
		this.ram = ram;
	}

	public float getRam() {
		return ram;
	}

	@Override
	public String toString() {
		return "PC [hardDisk=" + hardDisk + ", ram=" + ram + "]";
	}

	public void setRam(float ram) {
		this.ram = ram;
	}

	public void setHardDisk(float hardDisk) {
		this.hardDisk = hardDisk;
	}

	@Override
	public float getHardDisk() {
		// TODO Auto-generated method stub
		return this.hardDisk;
	}

	@Override
	public float getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public void display(Computer obj) {
		System.out.println("inside PC : "+obj);
		
	}
}

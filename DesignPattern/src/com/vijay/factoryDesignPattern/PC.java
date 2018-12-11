package com.vijay.factoryDesignPattern;

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

	public void display(){
		System.out.println("inside PC");
	}
}

package com.vijay.abstractFactory;

public class Server implements Computer{

	private float hardDisk;
	private float ram;

	public Server(float hd, float ram) {
		this.hardDisk = hd;
		this.ram = ram;
	}

	public float getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(float hardDisk) {
		this.hardDisk = hardDisk;
	}

	public float getRam() {
		return ram;
	}

	public void setRam(float ram) {
		this.ram = ram;
	}

	@Override
	public float getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}
	
	@Override
	public String toString() {
		return "Server [hardDisk=" + hardDisk + ", ram=" + ram + "]";
	}

	@Override
	public void display(Computer obj) {
		System.out.println("inside Server: "+obj);
		
	}

}

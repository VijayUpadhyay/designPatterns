package com.vijay.abstractFactory;

public class PCAbstract implements ComputerAbstractFactory{

	float hd;
	float ram;
	
	public PCAbstract(float hd, float ram) {
		this.hd = hd;
		this.ram = ram;
	}
	
	@Override
	public Computer createComputer() {
		System.out.println("Inside PC Abstract");
		return new PC(hd,ram);
	}

	
}

package com.vijay.abstractFactory;

public class ServerAbstractFactory implements ComputerAbstractFactory{

	float hd;
	float ram;
	
	public ServerAbstractFactory(float hd, float ram) {
		this.hd = hd;
		this.ram = ram;
	}
	@Override
	public Computer createComputer() {
		System.out.println("Inside Server Abstract");
		return new Server(hd,ram);
	}

}

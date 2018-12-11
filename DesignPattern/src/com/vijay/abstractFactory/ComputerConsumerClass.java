package com.vijay.abstractFactory;

public class ComputerConsumerClass {

	public static Computer getComputer(ComputerAbstractFactory obj){
		return obj.createComputer();
	}
	
}

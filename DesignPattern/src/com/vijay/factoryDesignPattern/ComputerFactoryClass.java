package com.vijay.factoryDesignPattern;

public class ComputerFactoryClass {

	public static Computer getComputer(String str,float hardDisk,float ram){
		
		if(str.equalsIgnoreCase("PC"))
			return new PC(hardDisk,ram);
		else if(str.equalsIgnoreCase("Server"))
			return new Server(hardDisk, ram);
		else 
			return null;
	}
}

package com.vijay.factoryDesignPattern;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer comp = ComputerFactoryClass.getComputer("server", 3.22f, 4.00f);
		comp.display();
	}

}

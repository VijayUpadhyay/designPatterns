package com.vijay.singletonDesignPattern;

public class EagerInitialization1 {
	
	public static void main(String[] args) {
		
		EagerInitialization obj = EagerInitialization.getnstance();
		obj.display(obj);
	}

}

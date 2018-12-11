package com.vijay.singletonDesignPattern;

public class EagerInitialization {

	private EagerInitialization(){};
	
	private static EagerInitialization obj = new EagerInitialization();
	
	public static EagerInitialization getnstance(){
		return obj;
	}
	
	public void display(EagerInitialization obj){
		System.out.println("Singleton Class"+obj);
	}
	/*public static EagerInitialization getInstance(EagerInitialization object){
		
		if(object == null)
			object = new EagerInitialization();
		return object;
	}*/
}

package com.vijay.singletonDesignPattern;

public class StaticSingletonDesignPattern {

	private static StaticSingletonDesignPattern obj;

	static{
		try{
			obj =new StaticSingletonDesignPattern();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private StaticSingletonDesignPattern(){}


}

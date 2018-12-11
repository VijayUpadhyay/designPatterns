package com.vijay.singletonDesignPattern;

public class StaticSingletonDesignPattern {
	
	private StaticSingletonDesignPattern(){}
	
	private static StaticSingletonDesignPattern obj;
	
	static{
		try{
			obj =new StaticSingletonDesignPattern();
		}catch(Exception e){
			e.printStackTrace();
			}
	}
	
	private static void display(StaticSingletonDesignPattern obj) {
		System.out.println("Static singleton DP"+obj);
	}


}

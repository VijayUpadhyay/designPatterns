package com.vijay.singletonDesignPattern;

import java.lang.reflect.Constructor;

public class FailingSingletonDesPatUsingReflection {

	public static void main(String[] args) {
		
		EagerInitialization obj = EagerInitialization.getnstance();
		
		EagerInitialization obj2 = null;
		
		try{
			Constructor[] constructor = EagerInitialization.class.getConstructors();
			for(Constructor cons : constructor){
				cons.setAccessible(true);
				
				obj2 = (EagerInitialization) cons.newInstance();
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(obj+"        :obj");
		System.out.println(obj2 +"          :obj2");

	}

}

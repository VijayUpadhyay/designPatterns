package com.vijay.singletonDesignPattern;

import java.io.Serializable;

public class SingletonDesignPatternSerialize implements Serializable {

	private SingletonDesignPatternSerialize() {
	}

	private static class HelperClass{
		private static final SingletonDesignPatternSerialize OBJ= new SingletonDesignPatternSerialize();
	}
	
	public static SingletonDesignPatternSerialize getInstance(){
		return HelperClass.OBJ;
	}

	protected Object readResolve() {
	    return getInstance();
	}
}

/*
 * EagerInitialization obj = EagerInitialization.getnstance(); obj.display(obj);
 */
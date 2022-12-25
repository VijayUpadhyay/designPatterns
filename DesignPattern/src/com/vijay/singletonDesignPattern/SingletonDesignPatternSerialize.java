package com.vijay.singletonDesignPattern;

import java.io.Serializable;

public class SingletonDesignPatternSerialize implements Serializable {
	private static class HelperClass{
		private static final SingletonDesignPatternSerialize OBJ= new SingletonDesignPatternSerialize();
	}

	private static final long serialVersionUID = -2399467761869059489L;

	public static SingletonDesignPatternSerialize getInstance(){
		return HelperClass.OBJ;
	}

	private SingletonDesignPatternSerialize() {
	}

	protected Object readResolve() {
		return getInstance();
	}
}

/*
 * EagerInitialization obj = EagerInitialization.getnstance(); obj.display(obj);
 */
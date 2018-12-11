package com.vijay.singletonDesignPattern;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getThreadSafeInstance(){
    	if(instance == null)
    		instance = new ThreadSafeSingleton();
    	return instance;
    }
    public static ThreadSafeSingleton getThreadSafeInstance1(){
    	if(instance == null)
    		synchronized (instance) {
				if(instance == null)
					instance = new ThreadSafeSingleton();
			}
    	return instance;
    }
}

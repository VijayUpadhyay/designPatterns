package com.vijay.singletonDesignPattern;

public class BillPughSingletonImpl {
	
	private BillPughSingletonImpl(){}
	
	private static class HelperClass{
		private static final BillPughSingletonImpl OBJ = new BillPughSingletonImpl();
	}
	
	public static BillPughSingletonImpl getInstance(){
		return HelperClass.OBJ;
	}
	
}

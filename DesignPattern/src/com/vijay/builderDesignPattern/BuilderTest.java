package com.vijay.builderDesignPattern;

public class BuilderTest {

	public static void main(String[] args) {
		
		Computer comp = new Computer.ComputerBuilder(1, 2, 3).setP(4).build();
		System.out.println(comp);
		
		Computer comp2 = new Computer.ComputerBuilder(1, 2, 3).setP(4).setQ(5).build();
		System.out.println(comp2);
	}

}

package com.vijay.abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		testAbstractFactory();
	}

	public static void testAbstractFactory(){
		Computer pc = ComputerConsumerClass.getComputer(new PCAbstract(1024f,8f));
		pc.display(pc);
		
		Computer server = ComputerConsumerClass.getComputer(new ServerAbstractFactory(2000f, 1024f));
		server.display(server);
	}
}

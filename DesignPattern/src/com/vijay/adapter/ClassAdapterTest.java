package com.vijay.adapter;

public class ClassAdapterTest {

	public static void main(String[] args) {
		SocketAdapter sockAdapter = new ClassAdapter();
		Volt v3 = getVolt(sockAdapter, 120);

		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 3);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolt());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolt());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolt());

	}

	public static Volt getVolt(SocketAdapter sockAdapter, int i) {

		switch (i) {
		case 3:
			return sockAdapter.get30Volt();
		case 12:
			return sockAdapter.get60Volt();
		case 120:
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}

	}

}

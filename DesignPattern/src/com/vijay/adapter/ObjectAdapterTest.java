package com.vijay.adapter;

public class ObjectAdapterTest {

	public static void main(String[] args) {
		SocketAdapter sockAdapter = new ObjectAdapter();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Object Adapter=" + v3.getVolt());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolt());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolt());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
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

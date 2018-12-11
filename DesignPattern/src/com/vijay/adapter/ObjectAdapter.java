package com.vijay.adapter;

public class ObjectAdapter implements SocketAdapter {

	private SocketClass sc = new SocketClass();

	@Override
	public Volt get120Volt() {
		return sc.getVolt();
	}

	@Override
	public Volt get60Volt() {
		Volt v = sc.getVolt();
		return getVoltage(v, 2);
	}

	@Override
	public Volt get30Volt() {
		Volt v = sc.getVolt();
		return getVoltage(v, 4);
	}
	private Volt getVoltage(Volt v,int a){
		return new Volt(v.getVolt()/a);
	}

}

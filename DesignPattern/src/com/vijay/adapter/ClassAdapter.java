package com.vijay.adapter;

public class ClassAdapter extends SocketClass implements SocketAdapter {

	public Volt countVoltage(Volt volt, int i) {
		return new Volt(volt.getVolt() / i);
	}

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get60Volt() {
		Volt v = getVolt();
		return countVoltage(v, 2);
	}

	@Override
	public Volt get30Volt() {
		Volt v = getVolt();
		return countVoltage(v, 4);
	}

}

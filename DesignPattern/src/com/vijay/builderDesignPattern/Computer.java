package com.vijay.builderDesignPattern;

public class Computer {
	
	private int a,b,c;
	private int p,q;
	
	@Override
	public String toString() {
		return "Computer [a=" + a + ", b=" + b + ", c=" + c + ", p=" + p + ", q=" + q + "]";
	}

	private Computer(ComputerBuilder obj){
		this.a=obj.a;
		this.b=obj.b;
		this.c=obj.c;
		
		this.p = obj.p;
		this.q=obj.q;
	}
	
	public static class ComputerBuilder{
		int a,b,c;
		int p,q;
		public ComputerBuilder(int a,int b,int c){
			this.a=a;
			this.b=b;
			this.c=c;
		}
		
		public ComputerBuilder setP(int j){
			this.p= j;
			return this;
		}
		
		public ComputerBuilder setQ(int k){
			this.q = k;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
	}

}

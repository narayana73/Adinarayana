package com.cog;

public class A {
	B b;
	
	public void execute(){
		System.out.println("Execute A");
		b.execute();
	}

	public A(B b) {
		super();
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	
	
}

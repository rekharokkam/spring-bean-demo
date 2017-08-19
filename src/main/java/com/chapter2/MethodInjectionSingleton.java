package com.chapter2;

/*
 * Spring will provide a proxy class that implements the abstract method required for method injection. Call to that method happens on the proxy class
 */
public abstract class MethodInjectionSingleton {
	
	private PrototypeBean prototype;

	public void setPrototype(PrototypeBean prototype) {
		this.prototype = prototype;
	}
	
	public abstract PrototypeBean createPrototype ();

}

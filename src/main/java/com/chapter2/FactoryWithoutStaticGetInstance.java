package com.chapter2;

public class FactoryWithoutStaticGetInstance {
	
	private FactoryWithoutStaticGetInstance (){
		System.out.println("Inside the private constructor of Factory method");
	}
	
	public FromFactoryWithoutStaticGetInstance getBeanInstance () {
		return new FromFactoryWithoutStaticGetInstance ();
	}
}

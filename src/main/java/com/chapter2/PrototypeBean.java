package com.chapter2;

public class PrototypeBean {
	private static int counter = 0;
	
	public PrototypeBean ()
	{
		System.out.println("Prototype bean number : " + (counter ++) );
	}
}

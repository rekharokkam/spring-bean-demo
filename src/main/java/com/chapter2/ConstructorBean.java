package com.chapter2;

public class ConstructorBean {
	
	public ConstructorBean (String value){
		System.out.println("Inside the Single String constructor : " + value);
	}

	public ConstructorBean (String value, String value2){
		System.out.println("Inside the 2 String arguments constructor : ");
		System.out.println(value);
		System.out.println(value2);
	}
	
	public ConstructorBean (int value){
		System.out.println("Inside the Int argument constructor : " + value);
	}
}

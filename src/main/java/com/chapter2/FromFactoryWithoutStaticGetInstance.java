package com.chapter2;

public class FromFactoryWithoutStaticGetInstance {
	public FromFactoryWithoutStaticGetInstance (){
		System.out.println("From inside the bean that's created through a factory class that has no static method to create the bean instance");
	}
}

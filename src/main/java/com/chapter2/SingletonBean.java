package com.chapter2;

//This bean is marrying Singleton scope with Prototype Scope
public class SingletonBean {
	private PrototypeBean prototype;
	
	public PrototypeBean createPrototype (){
		return prototype;
	}
	
	public void setPrototype (PrototypeBean prototype){
		this.prototype = prototype;
	}
}

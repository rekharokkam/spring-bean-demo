package com.chapter2.autowiring;

import org.springframework.beans.factory.BeanNameAware;

public class BeanD implements BeanNameAware {
	
	private String name;
	
	public BeanD ()
	{
		System.out.println("Constructor called : public BeanD ()");
	}
	
	public void setBeanName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

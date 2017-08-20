package com.chapter3.resource;

import org.springframework.beans.factory.BeanNameAware;

public class BeanB implements BeanNameAware, AccessibleBeanName {
	
	private String beanName;

	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}
}

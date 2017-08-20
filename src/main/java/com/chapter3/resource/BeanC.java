package com.chapter3.resource;

import org.springframework.beans.factory.BeanNameAware;

public class BeanC implements AccessibleBeanName, BeanNameAware {
	
	private String beanName;

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

}

package com.chapter3.componentscanning;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;


@Service ("thisIsAComponentScanning - Service")

public class BeanB implements BeanNameAware, AccessibleBeanName {
	
	private String beanName;

	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}
}

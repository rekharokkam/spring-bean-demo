package com.chapter3.lazy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service ("thisIsAComponentScanning - Service")
@Lazy
public class BeanB implements BeanNameAware, AccessibleBeanName {
	
	private String beanName;
	
	public BeanB() {
		System.out.println("Constructor :: BeanB");
	}

	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}
}

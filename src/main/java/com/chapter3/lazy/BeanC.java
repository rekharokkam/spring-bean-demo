package com.chapter3.lazy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository ("thisIsClassC")//Used for ORM
@Qualifier (value="magic")
@Lazy
public class BeanC implements AccessibleBeanName, BeanNameAware {
	
	private String beanName;
	
	public BeanC() {
		System.out.println("Constructor :: BeanC");
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

}

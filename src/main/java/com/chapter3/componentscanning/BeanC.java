package com.chapter3.componentscanning;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository ("thisIsClassC")//Used for ORM
@Qualifier (value="magic")
public class BeanC implements AccessibleBeanName, BeanNameAware {
	
	private String beanName;

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

}

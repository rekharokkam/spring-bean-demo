package com.chapter3.lazy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component ("beanA") // Flag that signals the IOC container that this class should be converted to a BEAN.
@Lazy
public class BeanA {
	
	private AccessibleBeanName accessibleBean;
	
	public BeanA() {
		System.out.println("Constructor :: BeanA");
	}

	public AccessibleBeanName getBean() {
		return accessibleBean;
	}

	@Autowired
	@Qualifier (value="magic")
	public void setUniqueBeanName(AccessibleBeanName bean) {
		this.accessibleBean = bean;
	}
}

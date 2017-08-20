package com.chapter3.componentscanning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component ("beanA") // Flag that signals the IOC container that this class should be converted to a BEAN.
public class BeanA {
	
	private AccessibleBeanName accessibleBean;

	public AccessibleBeanName getBean() {
		return accessibleBean;
	}

	@Autowired
	@Qualifier (value="magic")
	public void setUniqueBeanName(AccessibleBeanName bean) {
		this.accessibleBean = bean;
	}
}

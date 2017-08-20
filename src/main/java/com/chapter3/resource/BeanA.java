package com.chapter3.resource;

import javax.annotation.Resource;
import com.chapter3.qualifier.MyQualifierAnnotation;

public class BeanA {
	
	private AccessibleBeanName bean;

	public AccessibleBeanName getBean() {
		return bean;
	}

	@Resource //This Annotation does AutoWire as well but byName NOT byType
	@MyQualifierAnnotation
	public void setUniqueBeanName(AccessibleBeanName bean) {
		this.bean = bean;
	}
}

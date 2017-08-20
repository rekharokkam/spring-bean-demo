package com.chapter3.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

	@Autowired // Since there are 2 Beans of same type IOC is not sure about which bean to inject into this class. So use Qualifier Annotation
//	@Qualifier (value="beanB2")// One way to use Qualifier annotation is to have the same name for value property both in the context xml and in here. Another option is to use beanId without qualifier element inside the bean element in the xml
	@MyQualifierAnnotation //Using a custom annotation
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
}

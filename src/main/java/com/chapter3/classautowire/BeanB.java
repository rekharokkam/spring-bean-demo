package com.chapter3.classautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {

	@Autowired
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}
	
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
}
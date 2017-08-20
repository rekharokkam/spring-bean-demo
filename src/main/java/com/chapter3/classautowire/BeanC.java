package com.chapter3.classautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	@Autowired 
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
}

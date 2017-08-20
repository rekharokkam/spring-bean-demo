package com.chapter3.classautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

	private BeanB beanB;
	
	private BeanC beanC;

	@Autowired (required=false)
	public BeanA (BeanB beanB){
		System.out.println("Inside the constructor of BeanA : public BeanA (BeanB beanB)");
		this.beanB = beanB;
	}

	@Autowired (required=false)
	public BeanA (BeanB beanB, BeanC beanC){
		System.out.println("Inside the constructor of BeanA : public BeanA (BeanB beanB, BeanC beanC)");
		this.beanB = beanB;
		this.beanC = beanC;
	}
	
	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanC getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
}

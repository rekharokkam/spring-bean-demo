package com.chapter3.classautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

	private BeanB beanB;
	
	private BeanC beanC;

	/*
	 * By default required is true. Setting it to false indicates to the IOC container not to throw exception if for some reason BeanB is not available during the initialization of BeanA
	 */
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

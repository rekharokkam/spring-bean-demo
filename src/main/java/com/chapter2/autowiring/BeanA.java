package com.chapter2.autowiring;

public class BeanA {
	
	private BeanB beanB;
	
	private BeanC beanC;
	
	private BeanR beanR;
	
	public BeanA (BeanB beanB){
		System.out.println("Constructor called : public BeanA (BeanB beanB)");
		this.beanB = beanB;
	}
	
	public BeanA (BeanB beanB, BeanC beanC){
		System.out.println("Constructor called : public BeanA (BeanB beanB, BeanC beanC)");
		this.beanB = beanB;
		this.beanC = beanC;
	}
	
	public BeanA (BeanB beanB, BeanC beanC, BeanR beanR){
		System.out.println("Constructor called : public BeanA (BeanB beanB, BeanC beanC, BeanR beanR)");
		this.beanB = beanB;
		this.beanC = beanC;
		this.beanR = beanR;
	}
}

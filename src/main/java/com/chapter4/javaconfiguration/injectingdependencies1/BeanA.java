package com.chapter4.javaconfiguration.injectingdependencies1;

public class BeanA
{
	private BeanB beanB;
	
	public BeanA(BeanB beanB)
	{
		this.beanB = beanB;
	}
	
	public void execute (){
		System.out.println(beanB.getBeanC().getMessage());
	}

	public BeanB getBeanB()
	{
		return beanB;
	}

	public void setBeanB(BeanB beanB)
	{
		this.beanB = beanB;
	}
}

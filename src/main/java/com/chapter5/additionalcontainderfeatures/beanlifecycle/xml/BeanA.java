package com.chapter5.additionalcontainderfeatures.beanlifecycle.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanA
{
	private BeanB beanB;

	@PostConstruct
	//Post initialization hook. This method should accept no argument and not return anything.
	public void init (){
		System.out.println(beanB.getMessage());
	}
	
	@PreDestroy
	//Callback method that gets called before a bean is destroyed. Should accept no argument and be void
	private void destroy()
	{
		System.out.println("destroying our bean");
	}
	
	public void setBeanB(BeanB beanB)
	{
		this.beanB = beanB;
	}
	
	
	public BeanB getBeanB (){
		return beanB;
	}
}

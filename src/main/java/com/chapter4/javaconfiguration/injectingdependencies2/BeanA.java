package com.chapter4.javaconfiguration.injectingdependencies2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("injectingDependencies2BeanA")
public class BeanA
{
	private BeanB beanB;
	
	@Autowired
	public BeanA(BeanB beanB)
	{
		this.beanB = beanB;
	}
	
	public void execute (){
		System.out.println(beanB.getBeanC().getMessage());
	}
}

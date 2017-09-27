package com.chapter4.javaconfiguration.mixingconfigurationtypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mixingConfigurationBeanA")//Adding a name to avoid conflict with same class in the different package - com.chapter4.javaconfiguration.injectingdependencies2
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

package com.chapter4.javaconfiguration.mixingconfigurationtypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("mixingConfigurationBeanB")//Adding a name to avoid conflict with same class in the different package - com.chapter4.javaconfiguration.injectingdependencies2
public class BeanB
{
	private BeanC beanC;

	/**
	 * @return the beanC
	 */
	public BeanC getBeanC()
	{
		return beanC;
	}

	@Autowired
	public void setBeanC(BeanC beanC)
	{
		this.beanC = beanC;
	}
	
}

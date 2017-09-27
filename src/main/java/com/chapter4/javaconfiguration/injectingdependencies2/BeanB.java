package com.chapter4.javaconfiguration.injectingdependencies2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("injectingDependencies2BeanB")
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

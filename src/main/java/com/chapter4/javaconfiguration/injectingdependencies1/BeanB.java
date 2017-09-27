package com.chapter4.javaconfiguration.injectingdependencies1;

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

	/**
	 * @param beanC the beanC to set
	 */
	public void setBeanC(BeanC beanC)
	{
		this.beanC = beanC;
	}
	
}

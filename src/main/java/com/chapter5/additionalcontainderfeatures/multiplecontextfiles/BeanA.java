package com.chapter5.additionalcontainderfeatures.multiplecontextfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA
{
	private BeanB beanB;

	/**
	 * @return the beanB
	 */
	public BeanB getBeanB()
	{
		return beanB;
	}
	
	@Autowired
	public void setBeanB(BeanB beanB)
	{
		this.beanB = beanB;
	}
	
}

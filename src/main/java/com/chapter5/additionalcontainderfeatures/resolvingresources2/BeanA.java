package com.chapter5.additionalcontainderfeatures.resolvingresources2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanA
{
	@Value ("${properties.propertyA}")
	private String propertyA;
	
	@Value ("${properties.propertyB}")
	private String propertyB;
	
	@Value ("${properties.propertyC}")
	private boolean propertyC;
	/**
	 * @return the propertyA
	 */
	public String getPropertyA()
	{
		return propertyA;
	}
	/**
	 * @param propertyA the propertyA to set
	 */
	public void setPropertyA(String propertyA)
	{
		this.propertyA = propertyA;
	}
	/**
	 * @return the propertyB
	 */
	public String getPropertyB()
	{
		return propertyB;
	}
	/**
	 * @param propertyB the propertyB to set
	 */
	public void setPropertyB(String propertyB)
	{
		this.propertyB = propertyB;
	}
	/**
	 * @return the propertyC
	 */
	public boolean isPropertyC()
	{
		return propertyC;
	}
	/**
	 * @param propertyC the propertyC to set
	 */
	public void setPropertyC(boolean propertyC)
	{
		this.propertyC = propertyC;
	}
	
	
}

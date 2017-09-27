package com.chapter4.javaconfiguration.injectingdependencies2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("injectingDependencies2BeanC")
public class BeanC
{
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}
	
	@Autowired
	public void setMessage(@Value("Autowiring in java")String message)
	{
		this.message = message;
	}
}

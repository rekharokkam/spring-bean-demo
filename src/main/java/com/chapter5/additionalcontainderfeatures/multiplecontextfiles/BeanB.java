package com.chapter5.additionalcontainderfeatures.multiplecontextfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB
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
	public void setMessage(@Value ("This is component scanning in multiple context files")  String message)
	{
		this.message = message;
	}
}

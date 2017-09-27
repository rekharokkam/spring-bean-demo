package com.chapter5.additionalcontainderfeatures.resolvingresources2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationResolvingResources2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context-resource-resolver2.xml");
		
		BeanA beanA = context.getBean("beanA", BeanA.class);
		System.out.println("PropertyA : " + beanA.getPropertyA());
		System.out.println("PropertyB : " + beanA.getPropertyB());
		System.out.println("PropertyC : " + beanA.isPropertyC());
				
		((ClassPathXmlApplicationContext)context).close();
	}
}

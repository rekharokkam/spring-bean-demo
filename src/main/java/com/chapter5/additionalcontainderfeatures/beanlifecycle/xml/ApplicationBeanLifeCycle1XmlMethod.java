package com.chapter5.additionalcontainderfeatures.beanlifecycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationBeanLifeCycle1XmlMethod
{
	@SuppressWarnings ("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-bean-lifecycle-xml-method.xml"); 
		
		BeanA beanA = context.getBean("beanA", BeanA.class);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

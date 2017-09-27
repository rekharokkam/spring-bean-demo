package com.chapter4.javaconfiguration.injectingdependencies2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationInjectingDependencies2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BeanA beanA = context.getBean("injectingDependencies2BeanA", BeanA.class);
		
		beanA.execute();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}

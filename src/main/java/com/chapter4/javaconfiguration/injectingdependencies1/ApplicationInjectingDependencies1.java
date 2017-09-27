package com.chapter4.javaconfiguration.injectingdependencies1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class ApplicationInjectingDependencies1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BeanA beanA = context.getBean("injectingDependencies1BeanA", BeanA.class);
		
		beanA.execute();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}

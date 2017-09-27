package com.chapter4.javaconfiguration.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationJavaConfigurationIntroduction
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BeanA beanA = context.getBean("beanC", BeanA.class);
		beanA.execute();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}

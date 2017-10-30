package com.chapter4.javaconfiguration.mixingconfigurationtypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMixingConfigurationTypes
{
	public static void main(String[] args)
	{
//		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);//Use this when we are basing our configuration mainly upon Java Configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-mixing-configuration-types.xml"); //Use this when basing configurations mainly on XML Configuration
		
		BeanA beanA = context.getBean("mixingConfigurationBeanA", BeanA.class);
		
		beanA.execute();
		
//		((AnnotationConfigApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
	}
}

package com.chapter5.additionalcontainderfeatures.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationProfiles
{
	public static void main(String[] args)
	{
//		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-profiles.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigDEV.class, ApplicationConfig2TEST.class);
		
		BeanA beanA = context.getBean("beanA", BeanA.class);
		System.out.println(beanA.getConfigParameter());
		
		((AnnotationConfigApplicationContext)context).close();
	}
}

package com.chapter5.additionalcontainderfeatures.multiplecontextfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMultipleContextFiles
{
	public static void main(String[] args)
	{
//		ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context-multiple-context-files1.xml");
		
		//Instead of importing one context file in another context file, we can pass the 2 xml files as arguments to ClassPathXmlApplicationContext
//		ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context-multiple-context-files1.xml", "application-context-multiple-context-files2.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig1.class);
		
		BeanA beanA = context.getBean("beanA", BeanA.class);
		System.out.println(beanA.getBeanB().getMessage());
		
		((AnnotationConfigApplicationContext)context).close();
	}
}

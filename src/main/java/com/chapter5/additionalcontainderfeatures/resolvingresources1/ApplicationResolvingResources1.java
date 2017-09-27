package com.chapter5.additionalcontainderfeatures.resolvingresources1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationResolvingResources1
{
	public static void main(String[] args)
	{
//		With the help of ClassPathXmlApplicationContext it is possible to load the context file anywhere on the classpath.
//		ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context-resource-resolver.xml");
		
		//Another way of providing above configuration. Using "classpath:" is not necessary as we are using ClassPathXmlApplicationContext to boot strap the IOC Container
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/application-context-resource-resolver.xml");
		
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"file:/Users/ac-rekharokkam/Documents/Rekha/workspace/spring-bean-demo/src/main/resources/config/application-context-resource-resolver1.xml");
		
		MyResourceReader reader = context.getBean("myResourceReader", MyResourceReader.class);
		reader.print();
		
		((FileSystemXmlApplicationContext)context).close();
	}
}

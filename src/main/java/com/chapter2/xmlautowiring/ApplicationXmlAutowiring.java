package com.chapter2.xmlautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationXmlAutowiring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-xmlautowiring.xml");
		
		BeanA beanA = context.getBean(BeanA.class);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}

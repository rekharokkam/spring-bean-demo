package com.chapter2.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationAutowiring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-autowiring.xml");
		
		BeanA beanA = context.getBean(BeanA.class);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}

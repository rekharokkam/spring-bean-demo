package com.chapter3.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationResource {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-resource.xml");
		
		BeanA beanA = context.getBean(BeanA.class);
		
		System.out.println(beanA.getBean().getBeanName());
	}
}

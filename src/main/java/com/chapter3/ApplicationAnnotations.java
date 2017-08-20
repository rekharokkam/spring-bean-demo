package com.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationAnnotations {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-annotations.xml");
		
		BeanA beanA = context.getBean(BeanA.class);
		System.out.println("The property : " + beanA.getMyProperty());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

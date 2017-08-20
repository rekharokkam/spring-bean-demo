package com.chapter3.componentscanning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationComponentScanning {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-componentscan.xml");
		
		BeanA beanA = context.getBean("beanA", BeanA.class);
		
		System.out.println(beanA.getBean().getBeanName());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

package com.chapter3.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationLazy {

	public static void main(String[] args) throws InterruptedException{
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-lazy.xml");
		
		Thread.sleep(3000);
		
		BeanA beanA = context.getBean("beanA", BeanA.class);
		
		System.out.println(beanA.getBean().getBeanName());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

package com.chapter3.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-scope.xml");
		
		BeanA beanA1 = context.getBean("beanA", BeanA.class);
		BeanA beanA2 = context.getBean("beanA", BeanA.class);
		
		BeanB beanB1 = context.getBean("beanB", BeanB.class);
		BeanB beanB2 = context.getBean("beanB", BeanB.class);
		
		System.out.println((beanA1 == beanA2) ? "Same instance of BeanA" : "Different Instance of BeanA");
		
		System.out.println((beanB1 == beanB2) ? "Same instance of BeanB" : "Different Instance of BeanB");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

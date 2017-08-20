package com.chapter3.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationQualifier {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-qualifier.xml");
		
		BeanA beanA = context.getBean(BeanA.class);
		
		System.out.println(beanA.getBeanB().getMyProperty());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

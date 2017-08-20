package com.chapter3.classautowire;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClassAutowire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-classautowiring.xml");
		
//		BeanA beanA = context.getBean("beanA", BeanA.class);
//		
//		System.out.println(beanA.getBeanB().getBeanD().getMyProperty());
//		System.out.println(beanA.getBeanC().getBeanD().getMyProperty());

		BeanE beanE = context.getBean(BeanE.class);
		
		System.out.println("Printing Array");
		for(BeanF bean : beanE.getBeanFArray()){
			System.out.println(bean.getMyProperty());
		}
		
		System.out.println("Printing List");
		for(BeanF bean : beanE.getBeanFList()){
			System.out.println(bean.getMyProperty());
		}

		System.out.println("Printing Map");
		for(Entry<String, BeanF> bean : beanE.getBeanFMap().entrySet()){
			System.out.println(bean.getKey());
			System.out.println(bean.getValue());
		}

		
		((ClassPathXmlApplicationContext)context).close();
	}
}

package com.chapter2.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-collection.xml");
		
		CollectionContainerBean bean = context.getBean(CollectionContainerBean.class);
		
		System.out.println("\nPrinting List");
		for (ListObject listObject : bean.getList()){
			System.out.println("each List element : " + listObject);
		}
		
		System.out.println("\nPrinting Set");
		for (String name : bean.getSet()){
			System.out.println("each Set element : " + name);
		}

		System.out.println("\nPrinting Map");
		for (String key : bean.getMap().keySet()){
			System.out.println("each Map element : " + key);
		}
		
		System.out.println("\nPrinting properties");
		for (Object key : bean.getProperties().keySet()){
			System.out.println("each Properties element : " + key);
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

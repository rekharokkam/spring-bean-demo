package com.chapter2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareSingleton implements ApplicationContextAware {
	
	private ApplicationContext context;
	
	private PrototypeBean prototypeBean;
	
	public PrototypeBean createPrototype (){
		return context.getBean("prototypeBean", PrototypeBean.class);
	}
	
	public void setPrototypeBean (PrototypeBean prototypeBean){
		this.prototypeBean = prototypeBean;
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
}

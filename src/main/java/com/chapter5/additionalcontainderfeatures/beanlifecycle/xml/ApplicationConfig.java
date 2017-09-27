package com.chapter5.additionalcontainderfeatures.beanlifecycle.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig
{
	@Bean (initMethod="init", destroyMethod="destroy")
	public BeanA beanA (){
		BeanA beanA = new BeanA ();
		beanA.setBeanB(beanB());
		return beanA;
	}
	
	@Bean
	public BeanB beanB (){
		BeanB beanB =  new BeanB ();
		beanB.setMessage("CallBack methods");
		return beanB;
	}
}

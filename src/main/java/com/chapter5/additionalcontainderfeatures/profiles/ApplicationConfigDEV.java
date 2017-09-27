package com.chapter5.additionalcontainderfeatures.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration 
@Profile ("DEV")
public class ApplicationConfigDEV
{
	@Bean
	public BeanA beanA (){
		BeanA beanA = new BeanA ();
		beanA.setConfigParameter("DEV app config");
		return beanA;
	}
}

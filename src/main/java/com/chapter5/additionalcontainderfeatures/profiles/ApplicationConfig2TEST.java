package com.chapter5.additionalcontainderfeatures.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile ("TEST")
public class ApplicationConfig2TEST
{
	@Bean
	public BeanA beanA (){
		BeanA beanA = new BeanA ();
		beanA.setConfigParameter("TEST app config");
		return beanA;
	}
}

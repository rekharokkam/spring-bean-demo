package com.chapter4.javaconfiguration.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This class is the equivalent of application-context.xml file
@Configuration ("javaConfigurationIntroApplicationConfig")
public class ApplicationConfig
{
	//<bean id="beanA" class="com.chapter4.javaconfiguration.introduction.BeanA"/>
//	@Bean //This is equivalent to the <bean> tag. This is a method level tag. This indicates to IOC container that we are creating a new bean
	/*
	 *  A bean by default can be accessed through the method name as "id" if there is no "name" attribute. 
	 *  Once name attribute is provided then bean should be accessed only by those names.
	 */
	@Bean(name={"beanB", "beanC"}) 
	public BeanA beanA (){ //Method name serves as name/id, return type serves as the class attribute
		return new BeanA ();
	}
}

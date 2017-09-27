package com.chapter5.additionalcontainderfeatures.multiplecontextfiles;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chapter5.additionalcontainderfeatures.multiplecontextfiles")
public class ApplicationConfig2
{
//	@Bean
//	public BeanB beanB (){
//		BeanB beanB = new BeanB();
//		beanB.setMessage("From inside of second configuration file");
//		return beanB;
//	}
}

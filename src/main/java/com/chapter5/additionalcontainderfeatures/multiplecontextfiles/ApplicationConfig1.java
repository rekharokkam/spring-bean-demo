package com.chapter5.additionalcontainderfeatures.multiplecontextfiles;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import (ApplicationConfig2.class)
@ComponentScan ("com.chapter5.additionalcontainderfeatures.multiplecontextfiles")
public class ApplicationConfig1
{
//	@Autowired
//	private ApplicationConfig2 applicationConfig2;
	
//	@Bean
//	public BeanA beanA (){
//		BeanA beanA = new BeanA ();
//		beanA.setBeanB (applicationConfig2.getBeanB());
//		return beanA;
//	}
}

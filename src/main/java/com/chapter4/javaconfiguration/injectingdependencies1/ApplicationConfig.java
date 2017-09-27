package com.chapter4.javaconfiguration.injectingdependencies1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration ("injectingDependencies1ApplicationConfig")
public class ApplicationConfig
{
	/*
	 * <bean id="beanC" class="com.chapter4.javaconfiguration.injectingdependencies.BeanC">
	 * 	<property name="message" value="Java Configuration"/>
	 * </bean>
	 */
	@Bean (name={"injectingDependencies1BeanC"})
	public BeanC beanC (){
		BeanC beanC = new BeanC ();
		beanC.setMessage("Dependency Injection1 - basic");
		return beanC;
	}
	
	/*
	 * <bean id="beanB" class="com.chapter4.javaconfiguration.injectingdependencies.BeanB">
	 * 	<prperty name="beanC" ref="beanC"/>
	 * </bean>
	 */
	@Bean (name={"injectingDependencies1BeanB"})
	public BeanB beanB (){
		BeanB beanB = new BeanB ();
		beanB.setBeanC(beanC());
		return beanB;
	}
	
	
	/*
	 * <bean id="beanA" class="com.chapter4.javaconfiguration.injectingdependencies.BeanA">
	 * 	<constructor-arg type="com.chapter4.javaconfiguration.injectingdependencies.BeanB" ref="beanB"/>
	 * </bean>
	 */
	@Bean (name={"injectingDependencies1BeanA"})
	public BeanA beanA (){
		BeanA beanA = new BeanA (beanB());
		
		/*
		 * All the beans are by default Singleton scoped. 
		 * Before creating a new instance of the bean IOC container always checks to see if the bean is available,
		 * If available then that Obj from the container is returned. 
		 */
		BeanB beanB = beanB();
		BeanB beanB2 = beanB ();
		
		System.out.println((beanB == beanB2) ? "Same" : "Different");
		
		return beanA;
	}
}

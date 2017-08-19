package com.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-bean-demo.xml");
		
//		BeanA bean1 = context.getBean(BeanA.class);// IOC is confused after I added the beans with identifiers so commenting this part
//		BeanA bean2 = context.getBean(BeanA.class);
//		
//System.out.println("Are the 2 instances same : " + (bean1 == bean2));
		
//		BeanA bean3 = context.getBean("bean1", BeanA.class);
//		BeanA bean4 = context.getBean("bean2", BeanA.class);
//		
//System.out.println("Are the 2 beans with different Ids same : " + (bean3 == bean4));
//
//		BeanA bean5 = context.getBean("_beanA", BeanA.class);
//		BeanA bean6 = context.getBean("_beanB", BeanA.class);
//		
//System.out.println("Same bean instantiated through different names same :: " + (bean5 == bean6));		

//		ConstructorBean bean1 = context.getBean("singleStringBean", ConstructorBean.class);
//		
//		ConstructorBean bean2 = context.getBean("twoStringBean", ConstructorBean.class);
//		
//		ConstructorBean bean3 = context.getBean("intBean", ConstructorBean.class);

//		OuterObj bean1 = context.getBean("outerObj", OuterObj.class);
		
//		SetterObj bean1 = context.getBean(SetterObj.class);
//		bean1.getAttributeObj().execute();

//		PNameObj pnameObj = context.getBean(PNameObj.class);
//		pnameObj.getCnameObj().execute();		
		
//		FactoryMethodUserObj bean1 = context.getBean("factoryMethodUserObj", FactoryMethodUserObj.class);
//		System.out.println("Year : " + bean1.getYear());
		
//		FromFactoryWithoutStaticGetInstance bean1 = context.getBean(FromFactoryWithoutStaticGetInstance.class);
		
//		PrototypeBean bean1 = context.getBean(PrototypeBean.class);
		
//		PrototypeBean bean2 = context.getBean(PrototypeBean.class);
		
//		System.out.println("Are these 2 beans same : " + (bean1 == bean2));
		
//		SingletonBean singleton = context.getBean("singleton", SingletonBean.class);
//		
//		System.out.println("Are the prototypes created from Singleton same Object :: " + (prototype1 == prototype2));

//		ApplicationContextAwareSingleton singleton = context.getBean("appAwareSingleton", ApplicationContextAwareSingleton.class);
		
		MethodInjectionSingleton singleton = context.getBean(MethodInjectionSingleton.class);

		PrototypeBean prototype1 = singleton.createPrototype();//Everytime createPrototype Method is invoked the call is made to the proxy that returns a new instane everytime
		PrototypeBean prototype2 = singleton.createPrototype();

		
		System.out.println("Are the prototypes created from Method Injection Singleton same Object :: " + (prototype1 == prototype2));

		((ClassPathXmlApplicationContext)context).close();
	}
}

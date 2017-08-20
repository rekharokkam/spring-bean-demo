package com.chapter2.xmlautowiring;

public class BeanB {
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	//changing the name to beanD2 will make sure the bean with the id beanD2 gets invoked when autowire property is set to byName
	public void setBeanD2(BeanD beanD) {
//	public void setBeanD(BeanD beanD) {
		
		System.out.println("Setter Called : public void setBeanD (BeanD beanD)");
		System.out.println("Injected Bean Name: " + beanD.getName());
		this.beanD = beanD;
	}	
}

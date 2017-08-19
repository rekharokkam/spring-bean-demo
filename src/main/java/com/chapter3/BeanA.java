package com.chapter3;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanA {

	@Value ("Test1")//If this annotation should be placed here then @Required annotation on the method should be relaxed
	private String myProperty;

	public String getMyProperty() {
		return myProperty;
	}

//	@Required //Indicates that IOC container has marked the property required on BeanA. If using this annotation then the property should be set either here through @Value annotation OR in the XML file as property Setter
//	@Value ("Test1")
	public void setMyProperty(String myProperty) {
		this.myProperty = myProperty;
	}
	
}

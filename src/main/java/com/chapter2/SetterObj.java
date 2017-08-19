package com.chapter2;

public class SetterObj {

	private int age;
	private AttributeObj attributeObj;

	public void setAge(int age) {
		System.out.println("inside the age setter method");
		this.age = age;
	}

	public void setAttributeObj(AttributeObj attributeObj) {
		this.attributeObj = attributeObj;
	}

	public AttributeObj getAttributeObj() {
		return attributeObj;
	}
	
	
}

package com.chapter2;

@SuppressWarnings("unused")
public class PNameObj {
	private int age;
	private CNameObj cnameObj;
	
	public CNameObj getCnameObj() {
		return cnameObj;
	}
	public void setCnameObj(CNameObj cnameObj) {
		this.cnameObj = cnameObj;
	}
	public void setAge(int age) {
		System.out.println("Age attribute set : " + age);
		this.age = age;
	}
}

package com.chapter3.classautowire;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanE {
	
	@Autowired
	private BeanF[] beanFArray;
	
	@Autowired
	private List<BeanF> beanFList;
	
	@Autowired
	private Map<String, BeanF> beanFMap;

	public BeanF[] getBeanFArray() {
		return beanFArray;
	}

	public void setBeanFArray(BeanF[] beanFArray) {
		this.beanFArray = beanFArray;
	}

	public List<BeanF> getBeanFList() {
		return beanFList;
	}

	public void setBeanFList(List<BeanF> beanFList) {
		this.beanFList = beanFList;
	}

	public Map<String, BeanF> getBeanFMap() {
		return beanFMap;
	}

	public void setBeanFMap(Map<String, BeanF> beanFMap) {
		this.beanFMap = beanFMap;
	}
}

package com.chapter2.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionContainerBean {

	//set of names
	private Set<String> set;
	
	//list of Objects
	List<ListObject> list;
	
	//Map of string key and Object value
	Map<String, ListObject> map;
	
	//Properties of string key and string value
	Properties properties;

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public List<ListObject> getList() {
		return list;
	}

	public void setList(List<ListObject> list) {
		this.list = list;
	}

	public Map<String, ListObject> getMap() {
		return map;
	}

	public void setMap(Map<String, ListObject> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}

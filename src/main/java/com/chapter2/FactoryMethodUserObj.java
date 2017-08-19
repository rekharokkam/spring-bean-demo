package com.chapter2;

import java.util.Calendar;

public class FactoryMethodUserObj {
	
	private Calendar calendar;
	
	private FactoryMethodUserObj (Calendar calendar){
		this.calendar = calendar;
	}
	
	public int getYear (){
		return calendar.get(Calendar.YEAR);
	}
}

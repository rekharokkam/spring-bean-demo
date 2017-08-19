package com.chapter2;

public class OuterObj {
	public OuterObj (ArgumentObj a){
		System.out.println("inside the outer Object");
		a.execute();
	}
}

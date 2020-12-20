package com.core.java.inheritance;

public class BasicService {

	protected void save() {
		System.out.println("Basic Service save() Method");
	}
	
	protected void edit() {
		System.out.println("Basic Service edit() Method");
	}
	
	protected void delete() {
		System.out.println("Basic Service delete() Method");
	}
	
	final public void showBaseService() {
		System.out.println("Basic Service showBaseService() Method");
	}
}

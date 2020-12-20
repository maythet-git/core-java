package com.core.java.abstract_;

public abstract class BasicService {

	protected abstract void doValidate();
	protected abstract void addBusinessLogic();
	
	final public void save() {
		this.doValidate();
		this.addBusinessLogic();
		this.insert();
	}
	private void insert() {
		System.out.println("Insert data");
		
	}

}

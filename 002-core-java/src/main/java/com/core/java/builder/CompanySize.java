package com.core.java.builder;

public enum CompanySize {
	//@formatter:off
	SIZE_25(25),
	SIZE_50(50),
	SIZE_100(100),
	SIZE_200(200),
	SIZE_400(400),
	SIZE_600(600),
	SIZE_800(800),
	SIZE_1000(1000);
	//@formatter:on
	
	private int size;
	
	private CompanySize() {
		
	}
	
	private CompanySize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}

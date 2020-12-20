package com.core.java.inheritance;

public class CompanyService extends BasicService{

@Override
protected void save() {
	System.out.println("Company Service save() Method");
}
}

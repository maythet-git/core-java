package com.core.java.inheritance.app;

import com.core.java.inheritance.BasicService;
import com.core.java.inheritance.CompanyService;
import com.core.java.inheritance.DepartmentService;
import com.core.java.inheritance.EmployeeService;

public class App {

	public static void main(String[] args) {
		
		BasicService basicService = new BasicService();
		
		BasicService comService = new CompanyService();
		
		BasicService deptService = new DepartmentService();
		
		BasicService empService = new EmployeeService();
		

	}
}

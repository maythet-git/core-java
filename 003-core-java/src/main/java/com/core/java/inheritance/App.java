package com.core.java.inheritance;

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
		
		basicService.save();
		comService.save();
		deptService.save();
		empService.save();
		
		System.out.println();
		
		basicService.showBaseService();
		comService.showBaseService();
		deptService.showBaseService();
		empService.showBaseService();
	}
}

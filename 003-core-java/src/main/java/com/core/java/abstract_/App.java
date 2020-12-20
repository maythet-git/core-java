package com.core.java.abstract_;


public class App {

	public static void main(String[] args) {
		
		BasicService comService = new CompanyService();
		
		BasicService deptService = new DepartmentService();
		
		BasicService empService = new EmployeeService();
		
		comService.save();	
		System.out.println();
		
		deptService.save();
		System.out.println();
		
		empService.save();
		System.out.println();
	}
}

package com.core.java.common;

public enum EmployeeType {
	//@formatter:off
	OFFICE_STAFF(0, "Office Staff"), 
	PROGRAMMER(1, "Programmer"), 
	SOFTWARE_ENGINEER(2, "Software Engineer"),
	NETWORK_ENGINEER(3, "Network Engineer"), 
	PROJECT_MANAGER(4, "Project Manager"),
	DEPARTMENT_MANAGER(5, "Department Manager"), 
	CEO(6, "CEO"), DIRECTOR(7, "Director"), 
	PRESIDENT(8, "President");
	//@formatter:on

	private int id;
	private String type;

	private EmployeeType() {

	}

	private EmployeeType(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

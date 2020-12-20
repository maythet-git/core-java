package com.core.java.encapsulation;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String phone;
	private Integer numOfEmployee;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(Integer id, String name, String phone, Integer numOfEmployee) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.numOfEmployee = numOfEmployee;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getNumOfEmployee() {
		return numOfEmployee;
	}
	public void setNumOfEmployee(Integer numOfEmployee) {
		this.numOfEmployee = numOfEmployee;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numOfEmployee == null) ? 0 : numOfEmployee.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfEmployee == null) {
			if (other.numOfEmployee != null)
				return false;
		} else if (!numOfEmployee.equals(other.numOfEmployee))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", phone=" + phone + ", numOfEmployee=" + numOfEmployee
				+ "]";
	}
}

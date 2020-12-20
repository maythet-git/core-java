package com.core.java.builder;

public class Company {

	private Integer id;
	private String name;
	private String address;
	private String phone;
	private CompanyType type;
	private CompanySize size;

	
	
	public static CompanyBuilder builder() {
		return new CompanyBuilder();
	}

	public static class CompanyBuilder {
		
		
		private Integer id;
		private String name;
		private String address;
		private String phone;
		private CompanyType type;
		private CompanySize size;
		
		public CompanyBuilder id(Integer id) {
			this.id = id;
			return this;
			
		}
		
		public CompanyBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public CompanyBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public CompanyBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public CompanyBuilder type(CompanyType companyType) {
			this.type = companyType;
			return this;
		}
		
		public CompanyBuilder size(CompanySize companySize) {
			this.size = companySize;
			return this;
		}
		
		public Company build() {
			Company company = new Company();
			company.id = this.id;
			company.name = this.name;
			company.address = this.address;
			company.phone = this.phone;
			company.type = this.type;
			company.size = this.size;
			return company;
		}
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", type=" + type
				+ ", size=" + size.getSize() + "]";
	}
	
	
}
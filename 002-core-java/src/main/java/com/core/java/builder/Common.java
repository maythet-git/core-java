package com.core.java.builder;

import java.util.ArrayList;
import java.util.List;

import com.core.java.builder.Company.CompanyBuilder;

public class Common {

	private static volatile Common instance = null;

	private Common() {
		// TODO Auto-generated constructor stub
	}

	public static Common getInstance() {
		if (null == instance) {
			synchronized (Common.class) {
				if (null == instance) {
					instance = new Common();
				}
			}
		}
		return instance;
	}

	public Company getCompany() {
		Company company = Company.builder().id(1).name("May").address("Yangon").phone("09428181811")
				.type(CompanyType.FOREIGN).size(CompanySize.SIZE_200).build();
		return company;
	}
}

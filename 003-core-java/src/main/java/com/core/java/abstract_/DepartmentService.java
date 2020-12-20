package com.core.java.abstract_;

public class DepartmentService extends BasicService {

	@Override
	protected void doValidate() {
		System.out.println("doValidate in DepartmentService");
		
	}

	@Override
	protected void addBusinessLogic() {
		System.out.println("addBusinessLogic in DepartmentService");
		
	}


}

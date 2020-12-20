package com.core.java.singleton.eager;

import java.util.ArrayList;
import java.util.List;

public class Common {

	private static final Common instance = new Common();

	private Common() {
		// TODO Auto-generated constructor stub
	}

	public static Common getInstance() {
		return instance;
	}
	
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		
		for(int i=1; i < 10; i++) {
			list.add("Mg Mg" + i);
		}
		return list;
	}

}

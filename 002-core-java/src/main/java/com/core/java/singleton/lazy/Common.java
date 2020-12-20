package com.core.java.singleton.lazy;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		
		for(int i=1; i < 10; i++) {
			list.add("Mg Mg" + i);
		}
		return list;
	}

}

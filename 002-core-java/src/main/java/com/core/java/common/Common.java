package com.core.java.common;

import java.util.ArrayList;
import java.util.List;

public class Common {
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		
		for(int i=1; i < 10; i++) {
			list.add("Mg Mg" + i);
		}
		return list;
	}
}

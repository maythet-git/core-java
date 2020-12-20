package com.core.java.singleton.eager;

public class App {

	public static void main(String[] args) {
		Common.getInstance().getList().forEach(System.out :: println);

	}

}

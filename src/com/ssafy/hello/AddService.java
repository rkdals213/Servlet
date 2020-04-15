package com.ssafy.hello;

public class AddService {
	private static AddService service = new AddService();
	
	public static AddService getService() {
		return service;
	}
	
	private AddService() {}
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
}

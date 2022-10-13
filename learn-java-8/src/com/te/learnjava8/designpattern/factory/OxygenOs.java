package com.te.learnjava8.designpattern.factory;

public class OxygenOs implements AndroidOs {

	@Override
	public void performance() {
		System.out.println("OxygenOs performance()!");
	}

	@Override
	public void security() {
		System.out.println("OxygenOs security()!");
	}

	@Override
	public void ui() {
		System.out.println("OxygenOs ui()!");
	}

}

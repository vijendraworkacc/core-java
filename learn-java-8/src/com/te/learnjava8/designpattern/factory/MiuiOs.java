package com.te.learnjava8.designpattern.factory;

public class MiuiOs implements AndroidOs {

	@Override
	public void performance() {
		System.out.println("MiuiOs performance()!");
	}

	@Override
	public void security() {
		System.out.println("MiuiOs security()!");
	}

	@Override
	public void ui() {
		System.out.println("MiuiOs ui()!");
	}

}

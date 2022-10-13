package com.te.learnjava8.designpattern.factory;

public class ColorOs implements AndroidOs {

	@Override
	public void performance() {
		System.out.println("ColorOs performance()!");
	}

	@Override
	public void security() {
		System.out.println("ColorOs security()!");
	}

	@Override
	public void ui() {
		System.out.println("ColorOs ui()!");
	}

}

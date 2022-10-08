package com.te.learnjava8.advance.java8features.defaultmethods;

interface Left {
	default void m1() {
		System.out.println("Left m1() basic implementation!");
	}

	default void m2() {
		System.out.println("Left m2() basic implementation!");
	}
}

interface Middle {
	default void m1() {
		System.out.println("Middle m1() basic implementation!");
	}

	default void m2() {
		System.out.println("Middle m2() basic implementation!");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right m1() basic implementation!");
	}

	default void m2() {
		System.out.println("Right m2() basic implementation!");
	}
}

public class LearnDefaultMethods2 implements Left, Middle, Right {

	@Override
	public void m1() {
		System.out.println("LearnDefaultMethods2 m1() implementation!");
	}

	@Override
	public void m2() {
		Middle.super.m2();
	}
	
}

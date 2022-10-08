package com.te.learnjava8.advance.java8features.staticmethods;

interface A {
	public static void m1() {
		System.out.println("A m1()!");
	}
}

public class LearnStaticMethods implements A {
	public static void main(String[] args) {
		A.m1();
	}
}

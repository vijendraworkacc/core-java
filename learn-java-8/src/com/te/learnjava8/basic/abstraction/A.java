package com.te.learnjava8.basic.abstraction;

public abstract class A {
	int a = 10;
	static int b = 20;
	static {
		System.out.println("static multiline-initializer!");
	}
	{
		System.out.println("non-static multiline-initializer!");
	}

	public void m1() {
		System.out.println("m1()!");
	}

	public static void m2() {
		System.out.println("m2()!");
	}

	A() {
		System.out.println("A()!");
	}

	public static void main(String[] args) {

	}
}

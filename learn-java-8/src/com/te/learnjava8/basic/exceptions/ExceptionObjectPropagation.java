package com.te.learnjava8.basic.exceptions;

class A {
	public void m3() {
		double res = 10 / 0;
	}

	public void m2() {
		m3();
	}

	public void m1() {
		m2();
	}
}

public class ExceptionObjectPropagation {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}

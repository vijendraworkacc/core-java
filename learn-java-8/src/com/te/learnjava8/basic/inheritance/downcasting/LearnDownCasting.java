package com.te.learnjava8.basic.inheritance.downcasting;

class A {
	int a = 10;

	public void m1() {
		System.out.println("m1()!");
	}
}

class B extends A {
	int b = 10;

	public void m2() {
		System.out.println("m2()!");
	}
}

public class LearnDownCasting {
	public static void main(String[] args) {
		// Up-casting!
		A a = new B();
		a.m1();
		// a.m2();

		// Down-casting!
		B b = (B) a;
		b.m1();
		b.m2();
	}
}

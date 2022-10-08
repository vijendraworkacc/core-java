package com.te.learnjava8.basic.inheritance.downcasting.classcastexp;

class A {
	int a = 10;
}

class B extends A {
	int b = 20;
}

class C extends B {
	int c = 30;
}

public class ClassCast {
	public static void main(String[] args) {
		A a = new B(); // a , b
		C c = (C) a; // ClassCastException!
		
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c); // <-- problem!
		
		System.out.println(((C) a).a);
		
	}
}

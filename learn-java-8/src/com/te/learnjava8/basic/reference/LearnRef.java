package com.te.learnjava8.basic.reference;

class A {
	int a = 10;

	A(int a) {
		this.a = a;
	}
}

public class LearnRef {
	public static void main(String[] args) {
		A a1 = new A(20);
		A a2 = new A(30);
		A a3;
		a2 = a1;
		a3 = a1;
		a2.a = 2;
		a3.a = 3;

		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(a3.a);
	}
}

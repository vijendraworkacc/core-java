package com.te.learnjava8.basic.polymorphism;

class A {
	// Variable hiding!
	int a = 10;

	// Method hiding!
	public static void m1() {
		System.out.println("m1() from A!");
	}

	public void m2() {
		System.out.println("m2() from A!");
	}

}

class B extends A {
	
	// Variable hiding!
	int a = 20;

	// Method hiding!
	public static void m1() {
		System.out.println("m1() from B!");
	}
	
	// Method overriding!
	public void m2() {
		System.out.println("m2() from A!");
	}
}

public class CompileTimePoly2 {
	public static void main(String[] args) {

		A a1 = new A();
		// B b1 = (B) new A(); // ClassCastException!
		A a2 = new B();
		B b2 = new B();

		System.out.println(a1.a); // 10
		System.out.println(a2.a); // 10
		System.out.println(b2.a); // 20

		/*
		 * For variable shadowing the type of the reference variable matters.
		 * 
		 * 
		 * Case 1: A a1 = new A(); Here reference variable is of type A and also the
		 * object created. But only reference variable type is considered. So, when we
		 * call a1.a; we get the result 10;
		 * 
		 * Case 2: A a2 = new B(); Here the reference type is of A class, but the object
		 * is of B class. And as in variable shadowing only reference type is
		 * considered, when we perform a2.a we still get 10. Data of a stored in class B
		 * object is not considered.
		 * 
		 * Case 3: B b2 = new B(); In this case reference and object are of same type so
		 * B class 'a' variable was used.
		 */

		a1.m1();
		a2.m1();
		b2.m1();
	}
}

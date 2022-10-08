package com.te.learnjava8.basic;


class A {
	public void m3() {
		
	}	
}
public class SomeProgram {

	int a = 10;
	int c = 30;
	//  Non-static single line intializer
	
	static int b = 20;
	//         Static single line inittializer

	static {
		// Static multiline initializer
		A a = new A();
		a.m3();
		System.out.println("Static multiline-initializer: Start-up instructions executed at the time of class loading!");
	}

	{
		// Non-static multiline initializer
		A a = new A();
		a.m3();
		System.out.println("Non-static multiline-initializer: Start-up instructions executed at the time of object creation!");
	}

	public static void m1() {
		// Static method
		System.out.println("Static method m1() called!");
	}

	public void m2() {
		// Non-static method
		System.out.println("Non-static method m2() called!");
	}

	public SomeProgram() {
		// 1. Load all the non-static members of the class into the object.
		// 2. Execute non-static initializers from top to bottom.
		// 3. Execute programmer written instructions.
		System.out.println("SomeProgram(): Programmer written instructions in the constructor executed!");
	}
	
	public SomeProgram(int a) {
		// 1. Load all the non-static members of the class into the object.
		// 2. Execute non-static initializers from top to bottom.
		// 3. Execute programmer written instructions.
		this.a = a;
		System.out.println("SomeProgram(int a): Programmer written instructions in the constructor executed!");
	}
	
	public SomeProgram(int a, int c) {
		this(a);
		this.c = c;
		System.out.println("SomeProgram(int a, int c): Programmer written instructions in the constructor executed!");
	}

	public static void main(String[] args) {
		System.out.println("main(...) method called by the JVM!");
		SomeProgram.m1();
		SomeProgram program = new SomeProgram(30, 40);
		program.m2();
		
		int res = 10 & 20;
		System.out.println("Result: " + res);
		
		res = 10 | 20;
		System.out.println("Result: " + res);
	}
}

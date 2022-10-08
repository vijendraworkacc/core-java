package com.te.learnjava8.basic.inheritance;

class A {
	private int a = 10;
	public int aa = 10;

	static {
		System.out.println("Static intializer fron A!");
	}

	{
		System.out.println("Non-Static intializer fron A!");
	}

	A() {
		System.out.println("A()!");
	}

	private void m1() {
		System.out.println("m1()!");
	}

	public void m2() {
		System.out.println("m1()!");
	}

	public static void main(String[] args) {
		System.out.println("main(...) from A!");
	}
}

class B extends A {
	private int b = 20;
	public int bb = 10;

	static {
		System.out.println("Static intializer fron B!");
	}

	{
		System.out.println("Non-Static intializer fron B!");
	}

	public static void m3() {

	}

	B() {
		super();
		System.out.println("B()!");
	}
}

public class LearnInheritance01 {
		
	public static void demo(char a) {
		System.out.println(a);

	}

	public static void main(String[] args) {
		System.out.println("main(...) from LearnInheritance01!");
		B b = new B();
		B.m3();
		b.m3();

		int j = 50;
		char c = (char) j;
		
		
		System.out.println(c);
		
		int a = 20;
		switch (20) {
		case 20:
			System.out.println(20);
			break;
			
		case 19:
			System.out.println(19);
			break;

		default:
			break;
		}
	}
}

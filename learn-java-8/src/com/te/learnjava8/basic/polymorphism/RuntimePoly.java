package com.te.learnjava8.basic.polymorphism;

class Aa {
	public void m1() {
		System.out.println("m1() from Aa!");
	}
}

class Bb extends Aa {
	@Override
	public void m1() {
		System.out.println("m1() from Bb!");
	}
}

public class RuntimePoly {
	
	public static void main(String[] args) {
		Aa o1 = new Aa();
		Aa o2 = new Bb();
		/*
		 * Runtime polymorphism can be seen using method overriding, but for method
		 * overriding to happen up-casted reference is required!.
		 * 
		 * Without upcasting there is no method overriding.
		 */
		Bb o3 = new Bb();

		o1.m1();

		/*
		 * At the complile time it is desided that m1() method of class Aa will get
		 * executed. But this decision was changed at the Runtime and overriden version
		 * of m1() method in the child class was executed.
		 */
		o2.m1();

		o3.m1();
	}
}

package com.te.learnjava8.basic.abstraction;

public interface I {
	public static final int a = 10;

	public abstract void m1();

	default void m2() {
		System.out.println("Basic implementation!");
	}

	static void m3() {
		System.out.println("Basic implementation not inheritable!");
	}
}

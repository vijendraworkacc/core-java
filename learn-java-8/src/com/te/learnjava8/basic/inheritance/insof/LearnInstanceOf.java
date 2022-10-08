package com.te.learnjava8.basic.inheritance.insof;

class A {
	int a = 10;
}

class B extends A {
	int b = 20;
}

class C {
	int c = 30;
}

public class LearnInstanceOf {
	public static void main(String[] args) {
		B b = new B();
		boolean res = b instanceof A;
		System.out.println(res);

		A a = new A();
		boolean res2 = a instanceof B;
		boolean res3 = (new A()) instanceof B;
		System.out.println(res2);
		System.out.println(res3);

		C c = new C();
		// boolean res3 = c instanceof B; // CTE
		
		A aa = new B();
		boolean res4 = aa instanceof B;
		System.out.println(res4);
	}
}

package com.te.learnjava8.basic.strings;

public class LearnString2 {
	public static void main(String[] args) {
		String s1 = "JavaJava";
		String s2 = "Java" + "Java";
		String s3 = "Java";
		String s4 = "Java";
		String s5 = s3 + s4;

		System.out.println(s1 == s2); // true --> JavaJava in String pool
		System.out.println(s5 == s2); // false --> JavaJava in Heap Area
		System.out.println(s5 == s1); // false
	}
}

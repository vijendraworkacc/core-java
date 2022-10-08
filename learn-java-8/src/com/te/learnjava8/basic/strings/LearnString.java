package com.te.learnjava8.basic.strings;

public class LearnString {
	public static void main(String[] args) {
		String s = "Java"; // <-- 1
		String s1 = new String(s); // <-- 2
		String s2 = "Java";
		String s3 = "Java";
		String s4 = "Java";
		String s5 = "Java";
		String s6 = s1.toLowerCase(); // <-- 3
		String s7 = s2.toUpperCase(); // <-- 4
		System.out.println(s1); // Java
		System.out.println(s2); // Java
		System.out.println(s6); // java
		System.out.println(s7); // JAVA
		// Total 4 objects!
	}
}

package com.te.learnjava8.basic.strings;

public class LearnString1 {
	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "java";
		String s3 = s2.toUpperCase(); // JAVA

		System.out.println(s1 + ", " + s2 + ", " + s3);
		System.out.println(s1 == s3);
	}
}

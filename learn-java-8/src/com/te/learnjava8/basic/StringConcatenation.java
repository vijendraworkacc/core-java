package com.te.learnjava8.basic;

public class StringConcatenation {
	public static void main(String[] args) {
		String s1 = "Hello" + 20 + 30;
		String s2 = 20 + "Hello" + 30;
		String s3 = 20 + 30 + "Hello";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
// Hello2030
// 20Hello30
// 50Hello

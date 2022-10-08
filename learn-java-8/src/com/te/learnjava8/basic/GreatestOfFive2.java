package com.te.learnjava8.basic;

public class GreatestOfFive2 {
	public static void main(String[] args) {
		int a = 2;
		int b = 20;
		int c = -10;
		int d = 3;
		int e = 44;

		int res = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));

		System.out.println("Greatest of five is " + res);
	}
}

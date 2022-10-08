package com.te.learnjava8.basic;

public class GreatestOfFive {
	public static void main(String[] args) {
		int a = 2;
		int b = 20;
		int c = -10;
		int d = 3;
		int e = -44;

		int res = (a > b && a > c && a > d && a > e) 
				? a : (b > c && b > d && b > e)
						? b : (c > d && c > e)
								? c : (d > e)
										? d : e;

		System.out.println("Greatest of five is " + res);
	}
}

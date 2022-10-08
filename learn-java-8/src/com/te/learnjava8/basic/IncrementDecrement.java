package com.te.learnjava8.basic;

public class IncrementDecrement {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int res = a++ + ++b;
		System.out.println("result: " + res);
		
		int c = 10;
		int d = 20;
		int res_ = c-- + --d;
		System.out.println("result: " + res_);
	}
}

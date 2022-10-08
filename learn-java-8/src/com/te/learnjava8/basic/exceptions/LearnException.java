package com.te.learnjava8.basic.exceptions;

public class LearnException {

	public static void someMethod() {
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

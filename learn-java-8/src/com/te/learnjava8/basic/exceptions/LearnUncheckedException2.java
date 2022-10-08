package com.te.learnjava8.basic.exceptions;

public class LearnUncheckedException2 {

	public static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Result: " + divide(3, 0));
			// code...
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

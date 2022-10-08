package com.te.learnjava8.basic.exceptions;

public class LearnUncheckedException {

	public static double divide(double a, double b) {
		return a / b;
	}

	public static byte divide(byte a, byte b) {
		return (byte) (a / b);
	}

	public static void main(String[] args) {
		System.out.println("Result: " + divide(3D, 0));
		System.out.println("Result: " + divide((byte) 3, (byte) 0));
	}
}

package com.te.learnjava8.basic;

import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value: ");
		int nextInt = scanner.nextInt();
		System.out.println("Value entered: " + nextInt);
	}
}

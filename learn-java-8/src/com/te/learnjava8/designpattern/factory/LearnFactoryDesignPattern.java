package com.te.learnjava8.designpattern.factory;

import java.util.Scanner;

public class LearnFactoryDesignPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter os type: ");
		String osType = scanner.next();

		AndroidOs os = OsFactory.getOs(osType);
		os.performance();
		os.security();
		os.ui();
	}
}

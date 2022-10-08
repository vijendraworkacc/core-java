package com.te.learnjava8.basic.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearnCheckedException2 {

	/*
	 * 1. throws keyword is used in method declaration.
	 * 
	 * 2. It informs the calling method that the called method has statement which
	 * can be resposible for an checked exception but the called method itself is
	 * not handling it. And the calling method must handle it or declare it.
	 * 
	 * 3. The purpose of throws keyword is to force the calling to handle the
	 * exception.
	 * 
	 * 4. For unchecked exceptions, using throws will not make sense because
	 * unchecked exceptions are by default not forced on programmer or calling
	 * method to be handled.
	 */
	public static void useFile() throws FileNotFoundException {
		FileReader file = new FileReader("xyz.txt");
	}

	public static void main(String[] args) {
		System.out.println("Trying to read a file...");
		try {
			useFile();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
}

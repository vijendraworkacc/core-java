package com.te.learnjava8.basic.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearnCheckedException {

	public static void useFile() {
		try {
			FileReader file = new FileReader("xyz.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Trying to read a file...");
		useFile();
	}
}

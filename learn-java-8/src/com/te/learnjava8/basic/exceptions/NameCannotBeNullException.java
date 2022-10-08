package com.te.learnjava8.basic.exceptions;

// Checked exception
public class NameCannotBeNullException extends Exception {
	public NameCannotBeNullException(String message) {
		super(message);
	}
}

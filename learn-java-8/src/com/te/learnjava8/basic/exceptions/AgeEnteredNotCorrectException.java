package com.te.learnjava8.basic.exceptions;

public class AgeEnteredNotCorrectException extends RuntimeException {
	public AgeEnteredNotCorrectException(String message) {
		super(message);
	}
}

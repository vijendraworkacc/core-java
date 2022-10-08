package com.te.learnjava8.basic.exceptions;

public class LearnException2 {

	public static void checkName(String name) throws NameCannotBeNullException {
		if (name == null) {
			throw new NameCannotBeNullException("Name was null!");
		}
	}

	public static void checkAge(int age) {
		if (age < 18) {
			throw new AgeEnteredNotCorrectException("Age entered was not allowed!");
		}
	}

	public static void main(String[] args) {
		try {
			checkName(null);
		} catch (NameCannotBeNullException e) {
			System.out.println(e.getMessage());
		}
		checkAge(10);
		
	}
}

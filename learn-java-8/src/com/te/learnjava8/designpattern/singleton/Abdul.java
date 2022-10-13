package com.te.learnjava8.designpattern.singleton;

import java.time.LocalDate;

public class Abdul {

	private static Abdul abdul;

	private String name;
	private int age;
	private LocalDate dateOfBirth;

	private Abdul() {

	}

	private Abdul(String name, int age, LocalDate dateOfBirth) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public synchronized static Abdul getAbdul() {
		if (abdul == null) {
			abdul = new Abdul("Abdul", 24, LocalDate.of(1997, 12, 22));
			return abdul;
		}
		return abdul;
	}

	@Override
	public String toString() {
		return "Abdul [name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}

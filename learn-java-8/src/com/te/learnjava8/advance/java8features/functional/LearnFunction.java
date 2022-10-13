package com.te.learnjava8.advance.java8features.functional;

import java.util.function.Function;

public class LearnFunction {
	public static void main(String[] args) {
		// Student -> Employee

		Function<Student, Employee> function = s -> new Employee(s.getsId(), s.getsName(), s.getsAge());

		System.out.println(function.apply(new Student(1, "A", 22)));
	}
};

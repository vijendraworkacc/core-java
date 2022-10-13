package com.te.learnjava8.designpattern.builder;

import java.time.LocalDate;

public class LearnBuilderDesignPattern {
	public static void main(String[] args) {
		System.out.println("main(...) start!");
		Employee employee01 = new Employee("Ty001", "Name01", LocalDate.of(2019, 8, 22), 22, LocalDate.of(1999, 8, 22),
				24000);

		Employee employee02 = new EmployeeBuilder()
								.empAge(21)
								.empDOB(LocalDate.of(1999, 8, 22))
								.empDOJ(LocalDate.of(2019, 8, 22))
								.empName("Name02")
								.build();
		
		System.out.println(employee02);
		System.out.println("main(...) ends!");
	}
}

package com.te.learnjava8.advance.java8features.functional;

import java.util.function.Predicate;

interface A {
	void m1();

	void m2();

	void m3();
}

class Aimpl implements A {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}

}

public class LearnPredicate {

	public static void main(String[] args) {
		Predicate<Employee> predicate = new Predicate<Employee>() {
			@Override
			public boolean test(Employee employee) {
				if (employee.geteAge() > 21) {
					return true;
				}
				return false;
			}
		};

		Predicate<Employee> predicate_ = e -> e.geteAge() > 21;

		Employee employee = new Employee(1, "A", 20);
		Employee employee1 = new Employee(2, "A1", 29);
		Employee employee2 = new Employee(3, "A2", 22);
		Employee employee3 = new Employee(4, "A3", 19);
		System.out.println(predicate.test(employee));
		System.out.println(predicate.test(employee1));
		System.out.println(predicate_.test(employee2));
		System.out.println(predicate_.test(employee3));
	}
}

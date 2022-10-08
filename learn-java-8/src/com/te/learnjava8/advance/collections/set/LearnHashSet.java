package com.te.learnjava8.advance.collections.set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(1, "A", 23));
		employees.add(new Employee(2, "B", 13));
		employees.add(new Employee(3, "C", 24));
		employees.add(new Employee(3, "C", 24));
		employees.add(new Employee(4, "D", 22));

		employees.remove(new Employee(3, "C", 24));

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}

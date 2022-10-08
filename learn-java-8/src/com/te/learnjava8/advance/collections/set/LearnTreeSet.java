package com.te.learnjava8.advance.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class ComparatorForAgeAsscending implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.geteId() - o2.geteId();
	}

}

class ComparatorForAgeDesending implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.geteId() - o1.geteId();
	}

}

public class LearnTreeSet {
	public static void main(String[] args) {
		Comparator<Employee> comparator = new ComparatorForAgeDesending();
		Comparator<Employee> comparator2 = (o1, o2) -> o2.geteId() - o1.geteId();
		Set<Employee> employees = new TreeSet<Employee>(Collections.reverseOrder());
		employees.add(new Employee(1, "A", 23));
		employees.add(new Employee(2, "B", 13));
		employees.add(new Employee(3, "C", 24));
		employees.add(new Employee(6, "Z", 24));
		employees.add(new Employee(4, "D", 22));

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}

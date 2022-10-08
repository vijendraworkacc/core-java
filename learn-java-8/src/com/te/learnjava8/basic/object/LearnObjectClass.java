package com.te.learnjava8.basic.object;

public class LearnObjectClass {
	public static void main(String[] args) {
		Employee employee = new Employee("TY123", "Name01", 22);
		Employee employee1 = new Employee("TY123", "Name01", 22);
		Employee employee2 = employee;

		System.out.println("employee: " + employee.hashCode());
		System.out.println("employee1: " + employee1.hashCode());
		System.out.println("employee2: " + employee2.hashCode());

		System.out.println("employee.equals(employee1): " + employee.equals(employee1));
		System.out.println("employee.equals(employee2): " + employee.equals(employee2));

		System.out.println("employee == employee1: " + (employee == employee1));
		System.out.println("employee == employee2: " + (employee == employee2));
		
		
	}
}

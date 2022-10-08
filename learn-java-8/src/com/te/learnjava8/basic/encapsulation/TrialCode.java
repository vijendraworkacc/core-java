package com.te.learnjava8.basic.encapsulation;

import java.time.LocalDate;

public class TrialCode {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeId(1234);
		employee.setEmployeeDateOfBirth(LocalDate.of(2000, 7, 7));
		employee.setEmployeeName("Name");
		employee.setEmployeeAge(-21);
		
		System.out.println(employee.getEmployeeAge());
		
		employee.helper(new Address());
		
		
	}
}

package com.te.learnjava8.basic.encapsulation;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	private LocalDate employeeDateOfBirth;

	// Early instantiation
	private Address address = new Address();

	// Lazy instantiation
	public void helper() {
		this.address = new Address();
	}

	public void helper(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, int employeeAge, LocalDate employeeDateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeDateOfBirth = employeeDateOfBirth;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		System.out.println("setEmployeeAge(int employeeAge) called!");
		if (employeeAge <= 0) {
			System.out.println("Age entered is not correct!");
			return;
		}
		this.employeeAge = employeeAge;
	}

	public LocalDate getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}

	public void setEmployeeDateOfBirth(LocalDate employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}
}

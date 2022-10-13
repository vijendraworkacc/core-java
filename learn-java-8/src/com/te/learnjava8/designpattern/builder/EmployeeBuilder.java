package com.te.learnjava8.designpattern.builder;

import java.time.LocalDate;

public class EmployeeBuilder {
	private String empId;
	private String empName;
	private LocalDate empDOJ;
	private int empAge;
	private LocalDate empDOB;
	private double empSalary;

	public EmployeeBuilder() {
		super();
	}

	public EmployeeBuilder empId(String empId) {
		this.empId = empId;
		return this;
	}

	public EmployeeBuilder empName(String empName) {
		this.empName = empName;
		return this;
	}

	public EmployeeBuilder empDOJ(LocalDate empDOJ) {
		this.empDOJ = empDOJ;
		return this;
	}

	public EmployeeBuilder empAge(int empAge) {
		this.empAge = empAge;
		return this;
	}

	public EmployeeBuilder empDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
		return this;
	}

	public EmployeeBuilder empSalary(double empSalary) {
		this.empSalary = empSalary;
		return this;
	}
	
	public Employee build() {
		return new Employee(this.empId, this.empName, this.empDOJ, this.empAge, this.empDOB, this.empSalary);
	}
}
